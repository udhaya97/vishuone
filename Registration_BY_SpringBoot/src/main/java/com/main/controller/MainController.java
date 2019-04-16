package com.main.controller;

import java.util.Base64;


import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
//import org.springframework.boot.autoconfigure.web.ServerProperties.Session;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.main.model.Account;
import com.main.model.Benificiary;
import com.main.model.Registration;
import com.main.model.Transfer;
import com.main.repository.UserRepository;
import com.main.service.AccountService;
import com.main.service.BenificiaryService;
import com.main.service.Services;
import com.main.service.TransferService;
@RestController
public class MainController {

	@Autowired
	Services service;

	@Autowired
	AccountService acc;

	@Autowired
	BenificiaryService benificiarySer;

	@Autowired
	TransferService transferSer;

	@Autowired
	HttpSession session;

	@RequestMapping(value = "/")
	public ModelAndView indexPage(@ModelAttribute("registration") Registration registration) {
		return new ModelAndView("index");

	}

	// REGISTRATION PAGE
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView getPage(@ModelAttribute("registration") Registration registration) {
		return new ModelAndView("welcome");
	}

	// USER REGISTRATION
	@RequestMapping(value = "/create")
	public ModelAndView register(@ModelAttribute("registration") Registration registration) {
		registration.setpassword(Base64.getEncoder().encodeToString(registration.getpassword().getBytes()));
		System.out.println("Password" + registration.getpassword());
		service.registerUser(registration);

		return new ModelAndView("redirect:/login");
	}

	// LOGIN
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView Login(@ModelAttribute("registration") Registration registration) {
		return new ModelAndView("login");
	}

	// LOGIN VALIDATION
	@RequestMapping(value = "/check")
	public ModelAndView loginValidate(HttpServletRequest request,
			@ModelAttribute("registration") Registration registration) {
		String encoded = request.getParameter("password");
		System.out.println(encoded);
		String password = Base64.getEncoder().encodeToString(encoded.getBytes());
		System.out.println(password);

		String name = request.getParameter("name");

		Registration obj = service.loginValidate(name, password);
		System.out.println(obj.getpassword());
		session = request.getSession(true);
		session.setAttribute("user", obj);

		return new ModelAndView("redirect:/accsummary");

	}

	// ACCOUNT SUMMARY
	@RequestMapping(value = "/accsummary")
	public ModelAndView successPage(@ModelAttribute("registration") Registration registration) {
		Registration reg = (Registration) session.getAttribute("user");
		List<Account> listacc = acc.getAllAccount();
		ModelAndView modelAndView = null;
		if (listacc.size() == 0) {
			modelAndView = new ModelAndView("Menu", "list", listacc);
			modelAndView.addObject("customer", reg);
			return modelAndView;
		} else {
			modelAndView = new ModelAndView("Menu", "list", listacc);
			modelAndView.addObject("customer", reg);
			return modelAndView;
		}

	}

	// CREATE SAVING ACCOUNT
	@RequestMapping(value = "/account")
	public ModelAndView createAcc(@ModelAttribute("account") Account account) {
		Registration reg = (Registration) session.getAttribute("user");
		account.setRegister(reg);
		account.setAccType("SAVING");
		account.setAccBalance(10000);
		account.setAccId(12345);
		account.setCreatedDate(new Date());
		acc.createAccount(account);

		return new ModelAndView("redirect:/accsummary");
	}

	// LIST OF REGISTERED USER
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listUser(@ModelAttribute("registration") Registration registration) {
		List<Registration> list = service.getAllUser();
		return new ModelAndView("listUser", "list", list);
	}

	// ADD BENIFICIARY PAGE
	@RequestMapping(value = "/benificiaryPage/{page}")
	public ModelAndView benificiary(@PathVariable("page") int page,
			@ModelAttribute("benificiary") Benificiary benificiary) {
		System.out.println("page" + page);

		return new ModelAndView("benificiary", "pageNo", page);
	}

	// SAVE BENIFICIARY
	@RequestMapping(value = "/addBenificiary")
	public ModelAndView addBenificiary(@ModelAttribute("benificiary") Benificiary benificiary) {
		System.out.println("inside");
		Registration reg = (Registration) session.getAttribute("user");
		benificiary.setRegister(reg);
		benificiarySer.saveBenificiary(benificiary);
		return new ModelAndView("benificiary");
	}

	// FUND TRANSFER PAGE
	@RequestMapping(value = "/fundTransferPage/{page}")
	public ModelAndView fundTransfer(@PathVariable("page") int page, @ModelAttribute("transfer") Transfer transfer) {
		System.out.println("page" + page);
		Registration reg = (Registration) session.getAttribute("user");
		int regId = reg.getId();
		List<Benificiary> benificiary = (List<Benificiary>) benificiarySer.getListBenificiaryFortransfer(regId);
		Iterator<Benificiary> itr = benificiary.iterator();
		while (itr.hasNext()) {
			Benificiary b= (Benificiary) itr.next();
			System.out.println(b.getAccHolderName());
		}
//		for (Benificiary benificiary2 : benificiary) {
//			if(benificiary2.getIfsc()== null){
//				
//			}
//			System.out.println(benificiary2.getAccHolderName());
//		}
		// ModelAndView modelAndView = new ModelAndView("transfer", "pageNo",
		// page);
		ModelAndView modelAndView1 = new ModelAndView("transfer", "benificiary", benificiary);
		modelAndView1.addObject("reg", reg);
		return modelAndView1;
	}

	// FUND TRANSFER
	@RequestMapping(value = "/transferAmount")
	public ModelAndView transferAmount(@ModelAttribute("transfer") Transfer transfer) {
		System.out.println("inside controller");

		Registration reg = (Registration) session.getAttribute("user");
		int regId = reg.getId();
		System.out.println("regId" + regId);
		Account account = acc.getAccountForTransfer(regId);
		Benificiary benificiary = benificiarySer.getBenificiaryFortransfer(regId);
		System.out.println("Account" + account.getAccType());
		System.out.println("Benificiary" + benificiary.getEmail());
		if (account.getAccId() == transfer.getFromAccount()) {
			if (benificiary.getAccHolderName() == transfer.getBenificiaryName()) {
				if (transfer.getAmount() <= account.getAccBalance()) {
					int remainingAmount = (int) (account.getAccBalance() - transfer.getAmount());
					account.setAccBalance(remainingAmount);
					acc.createAccount(account);
					transferSer.savetransfer(transfer);
				}
			}

		}

		return new ModelAndView("transfer");
	}

}

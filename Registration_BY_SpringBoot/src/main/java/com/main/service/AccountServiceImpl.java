package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.AccountDao;
import com.main.model.Account;
import com.main.model.Registration;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountDao dao;

	@Override
	public Account createAccount(Account account) {
		
		return dao.createAccount(account);
	}

	@Override
	public List<Account> getAllAccount() {
		
		return dao.getAllAccount();
	}

	@Override
	public Account getAccountForTransfer(int regId) {
		System.out.println("inside service");
		return dao.getAccountForTransfer(regId);
	}

}

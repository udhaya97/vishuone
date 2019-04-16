package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.main.model.Account;
import com.main.model.Registration;


public interface AccountService {

	Account  createAccount(Account account);

	List<Account> getAllAccount();

	Account getAccountForTransfer(int regId);

}

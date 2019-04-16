package com.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Account;
import com.main.repository.AccountRepository;

@Repository
public class AccountDaoImpl implements AccountDao{
	@Autowired
	AccountRepository repo;
	@Override
	public Account createAccount(Account account) {
		
		return repo.save(account);
	}
	@Override
	public List<Account> getAllAccount() {
		
		return (List<Account>) repo.findAll();
	}
		
	@Override
	public Account getAccountForTransfer(int regId) {
		System.out.println("inside dao");
		
		return repo.findByPrimeId(regId);
	}

}

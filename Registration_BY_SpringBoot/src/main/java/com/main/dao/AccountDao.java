package com.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.main.model.Account;
import com.main.model.Registration;

@Repository
public interface AccountDao {

	Account createAccount(Account account);

	List<Account> getAllAccount();

	Account getAccountForTransfer(int regId);

}

package com.main.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.main.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	@Query("select a from Account a where a.id=?1")
	public Account findByPrimeId(int regId);

}

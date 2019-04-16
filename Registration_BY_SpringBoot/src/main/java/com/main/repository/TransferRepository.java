package com.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Account;
import com.main.model.Transfer;

public interface TransferRepository extends CrudRepository<Transfer, Integer>{

	

}

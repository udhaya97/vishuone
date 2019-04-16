package com.main.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.main.model.Account;
//import com.main.repository.TransferRepository;
import com.main.model.Transfer;
import com.main.repository.TransferRepository;

@Repository
public class TransferDaoImpl implements TransferDao{
	
	@Autowired
	TransferRepository repo;
	@Override
	public Transfer saveTransfer(Transfer transfer) {
	
		return repo.save(transfer);
	}


	

}

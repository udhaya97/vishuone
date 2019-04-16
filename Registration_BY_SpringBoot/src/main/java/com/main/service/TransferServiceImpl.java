package com.main.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.TransferDao;
import com.main.model.Account;
import com.main.model.Transfer;

@Service
@Transactional
public class TransferServiceImpl implements TransferService{
	@Autowired
	TransferDao dao;

	@Override
	public Transfer savetransfer(Transfer transfer) {
		
		return dao.saveTransfer(transfer);
	}


	

}

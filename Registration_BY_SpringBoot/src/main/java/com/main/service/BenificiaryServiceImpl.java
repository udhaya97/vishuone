package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.BenificiaryDao;
import com.main.model.Benificiary;

@Service
@Transactional
public class BenificiaryServiceImpl implements BenificiaryService{
	
	@Autowired
	BenificiaryDao dao;
	
	@Override
	public Benificiary saveBenificiary(Benificiary benificiary) {
		
		return dao.saveBenificiary(benificiary);
	}

	@Override
	public Benificiary getBenificiaryFortransfer(int regId) {
		
		return dao.getBenificiaryFortransfer(regId);
	}

	@Override
	public List<Benificiary> getListBenificiaryFortransfer(int regId) {
		
		return dao.getListBenificiaryFortransfer(regId);
	}

}

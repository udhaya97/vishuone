package com.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Benificiary;
import com.main.repository.BenificiaryRepository;

@Repository
public class BenificiaryDaoImpl implements BenificiaryDao{
	
	@Autowired
	BenificiaryRepository repo;
	@Override
	public Benificiary saveBenificiary(Benificiary benificiary) {
		
		return repo.save(benificiary);
	}
	@Override
	public Benificiary getBenificiaryFortransfer(int regId) {
		
		return repo.findByBenId(regId);
	}
	@Override
	public List<Benificiary> getListBenificiaryFortransfer(int regId) {
		
		return  repo.findByAccNumber(regId);
	}

}

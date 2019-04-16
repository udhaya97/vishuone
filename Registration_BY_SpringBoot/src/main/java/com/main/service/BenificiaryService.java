package com.main.service;

import java.util.List;

import com.main.model.Benificiary;

public interface BenificiaryService {
	

	public Benificiary saveBenificiary(Benificiary benificiary);

	public Benificiary getBenificiaryFortransfer(int regId);

	public List<Benificiary> getListBenificiaryFortransfer(int regId);
}

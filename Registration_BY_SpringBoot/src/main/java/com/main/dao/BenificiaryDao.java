package com.main.dao;

import java.util.List;

import com.main.model.Benificiary;

public interface BenificiaryDao {

	public Benificiary saveBenificiary(Benificiary benificiary);

	public Benificiary getBenificiaryFortransfer(int regId);

	public List<Benificiary> getListBenificiaryFortransfer(int regId);

}

package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.main.model.Benificiary;

public interface BenificiaryRepository extends CrudRepository<Benificiary, Integer>{
	
	@Query("select b from Benificiary b where b.id=?1")
	public Benificiary findByBenId(int regId);
	
	@Query(value="select b from Benificiary b where b.id=?1",nativeQuery=true)
	public List<Benificiary> findByAccNumber(int regId);
	
}

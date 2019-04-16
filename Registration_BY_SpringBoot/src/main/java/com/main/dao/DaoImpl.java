package com.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.model.Registration;
import com.main.repository.UserRepository;

@Repository
public class DaoImpl implements Dao {
	
	@Autowired
	UserRepository repo;
	@Override
	public Registration registerUser(Registration registration) {
		
		return repo.save(registration);
	}
	@Override
	public Registration loginValidate(String name,String password) {
		System.out.println("inside dao");
		return repo.findByPasswordAndName(name,password);
	}
	@Override
	public List<Registration> getAllUser() {
		
		return (List<Registration>) repo.findAll();
	}
	
	

}

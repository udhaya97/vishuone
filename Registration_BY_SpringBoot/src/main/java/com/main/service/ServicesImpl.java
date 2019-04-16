package com.main.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.Dao;
import com.main.model.Registration;

@Service
@Transactional
public class ServicesImpl implements Services {

	@Autowired
	Dao dao;

	@Override
	public Registration registerUser(Registration registration) {

		return dao.registerUser(registration);
	}

	@Override
	public Registration loginValidate(String name, String password) {
		System.out.println("inside service");
		return dao.loginValidate(name, password);
	}

	@Override
	public List<Registration> getAllUser() {
		
		return dao.getAllUser();
	}

}

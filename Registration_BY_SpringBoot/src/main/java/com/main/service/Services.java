package com.main.service;

import java.util.List;

import com.main.model.Registration;

public interface Services {

	Registration registerUser(Registration registration);

	Registration loginValidate(String name,String password);

	List<Registration> getAllUser();

}

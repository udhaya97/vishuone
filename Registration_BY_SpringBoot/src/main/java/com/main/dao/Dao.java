package com.main.dao;

import java.util.List;

import com.main.model.Registration;

public interface Dao {

	Registration registerUser(Registration registration);

	Registration loginValidate(String name,String password);

	List<Registration> getAllUser();

}

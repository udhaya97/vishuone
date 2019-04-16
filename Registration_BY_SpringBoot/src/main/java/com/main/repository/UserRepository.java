package com.main.repository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.main.model.Registration;


public interface UserRepository extends CrudRepository<Registration, Integer> {

	//String findPasswordByName(String name);


	//String findPasswordByUserName();
	//@Query("select R.password from Registration R where R.userName=?1")
	//String findPasswordByUsername(/*@Param("userName")*/String userName);
//
//	string findPasswordByName(@Param("name") String name);
	
	@Query("select user from Registration user where user.name=:name and user.password=:password")
	Registration findByPasswordAndName(@Param("name") String name,@Param("password") String password);
	
}

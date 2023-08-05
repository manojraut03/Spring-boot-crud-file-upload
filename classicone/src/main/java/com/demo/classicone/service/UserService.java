package com.demo.classicone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.classicone.model.User;
import com.demo.classicone.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repository;
	User user;

	public UserService() {
		// TODO Auto-generated constructor stub
	}
	
	public void saveUser(User user) {
		
		repository.save(user);
	
	}

}

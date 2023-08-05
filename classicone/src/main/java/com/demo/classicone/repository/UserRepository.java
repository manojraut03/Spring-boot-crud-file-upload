package com.demo.classicone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.classicone.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	

}

package com.charly.docker.service;

import java.util.List;

import com.charly.docker.entity.User;

public interface UserService {

	User findById(Long id);
	
	List<User> findAll();
	
}

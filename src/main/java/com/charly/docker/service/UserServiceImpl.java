package com.charly.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.charly.docker.entity.User;
import com.charly.docker.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElse(new User());
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}

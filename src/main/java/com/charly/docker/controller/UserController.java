package com.charly.docker.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charly.docker.entity.User;
import com.charly.docker.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	UserService userService;   
	
	@GetMapping(path = "/find/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) {
		return new ResponseEntity<>(userService.findById(id),HttpStatus.OK); 
	}
	
	@GetMapping(path = "/findAll")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<>(userService.findAll(),HttpStatus.OK); 
	}

}

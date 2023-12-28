package com.example.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.service.UserService;

@RestController
public class UserController {

	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		// TODO Auto-generated constructor stub
		
		this.userService = userService;
		
		
	}
	
}

package com.example.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		// TODO Auto-generated constructor stub
		
		this.userRepository = userRepository;
		
	}
		
}

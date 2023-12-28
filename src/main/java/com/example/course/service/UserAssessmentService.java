package com.example.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.repository.UserAssessmentRepository;

@Service
public class UserAssessmentService {

	private final UserAssessmentRepository userAssessmentRepository;
	
	@Autowired
	public UserAssessmentService(UserAssessmentRepository userAssessmentRepository) {
		// TODO Auto-generated constructor stub
		
		this.userAssessmentRepository = userAssessmentRepository;
		
	}
	
	
}

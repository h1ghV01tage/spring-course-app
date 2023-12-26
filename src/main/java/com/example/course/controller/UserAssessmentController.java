package com.example.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.service.UserAssessmentService;

@RestController
public class UserAssessmentController {

	private final UserAssessmentService userAssessmentService;
	
	@Autowired
	public UserAssessmentController(UserAssessmentService userAssessmentService) {
		// TODO Auto-generated constructor stub
		this.userAssessmentService = userAssessmentService;
	}
	
	
}

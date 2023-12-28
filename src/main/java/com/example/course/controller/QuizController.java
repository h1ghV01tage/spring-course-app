package com.example.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.service.QuizService;

@RestController
public class QuizController {

	private final QuizService quizService;
	
	@Autowired
	public QuizController(QuizService quizService) {
		// TODO Auto-generated constructor stub
		this.quizService = quizService;
				
		
	}
	
	
	
	
}

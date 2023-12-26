package com.example.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.repository.QuizRepository;

@Service
public class QuizService {

	private final QuizRepository quizRepository;
	
	@Autowired
	public QuizService(QuizRepository quizRepository) {
		// TODO Auto-generated constructor stub
		
		this.quizRepository = quizRepository;
				
		
	}
	
	
}

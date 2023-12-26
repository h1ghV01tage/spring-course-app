package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.model.Course;
import com.example.course.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, String> {

	
	
}

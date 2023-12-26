package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.model.Course;
import com.example.course.model.UserAssessment;

public interface UserAssessmentRepository extends JpaRepository<UserAssessment, String> {

	
	
}

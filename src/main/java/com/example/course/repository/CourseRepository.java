package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.course.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

	
	
}

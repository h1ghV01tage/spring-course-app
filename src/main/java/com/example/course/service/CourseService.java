package com.example.course.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.model.Course;
import com.example.course.repository.CourseRepository;

@Service
public class CourseService {

	private final CourseRepository courseRepository; 
	
	//Autowire the constructor with the repository
	@Autowired
	public CourseService(CourseRepository courseRepository) {
		
		this.courseRepository = courseRepository;
		
	}
	
	//Logic to add a course
	public Course addCourse(Course course) {
		
		return courseRepository.save(course);
		
	}
	
	
	//Logic to list all the courses
	public List<Course> getAllCourses(){
		
		return courseRepository.findAll();
		
	}
	
	
	
	
}

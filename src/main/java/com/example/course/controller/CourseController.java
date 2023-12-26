package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.model.Course;
import com.example.course.service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	private final CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		// TODO Auto-generated constructor stub
		
		this.courseService = courseService;
		
	}
	
	@GetMapping
	public List<Course> getAllCourses(){
		
		return courseService.getAllCourses();
		
	}
	
	
}

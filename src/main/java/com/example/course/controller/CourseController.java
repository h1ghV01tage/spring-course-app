package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.model.Course;
import com.example.course.service.CourseService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	private final CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService) {
		// TODO Auto-generated constructor stub
		
		this.courseService = courseService;
		
	}
	
	@PostMapping
	//logic to add a course
	public ResponseEntity<Course> addCourse(@Valid @RequestBody Course course) {
		
		Course newCourse = courseService.addCourse(course);
		return ResponseEntity.ok(newCourse);
		
	}
	
	//logic to get all the courses
	@GetMapping
	public List<Course> getAllCourses(){
		
		return courseService.getAllCourses();
		
	}
	
}

package com.example.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@PostMapping(value = "/add")
	//logic to add a course
	public ResponseEntity<Course> addCourse(@Valid @RequestBody Course course) {
		
		Course newCourse = courseService.addCourse(course);
		return ResponseEntity.ok(newCourse);
		
	}
	
	//logic to get all the courses
	@GetMapping(value="/list")
	public ResponseEntity<List<Course>> getAllCourses(){
		
		List<Course> courseList =  courseService.getAllCourses();
		
		return ResponseEntity.ok(courseList);
		
	}
	
	//logic to get a course by ID
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<?> getCourseById(@Valid @PathVariable(value = "id") Long id) {
		
		Course course = courseService.getCourseById(id);
		
		return ResponseEntity.ok(course);
		
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<?> updateCourseById(@Valid @PathVariable(value = "id") Long id,@Valid @RequestBody Course course){
		
		Course newCourse = courseService.updateCourse(id, course);
		
		return ResponseEntity.ok(newCourse);
		
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteCourseById(@Valid @PathVariable(value = "id")Long id) {
		
		courseService.deleteCourse(id);
		
		return ResponseEntity.ok("Successfully deleted the course");
		
	}
}

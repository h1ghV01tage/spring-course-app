package com.example.course.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.model.Course;
import com.example.course.model.Instructor;
import com.example.course.repository.CourseRepository;
import com.example.course.repository.InstructorRepository;

@Service
public class CourseService {

	private final CourseRepository courseRepository; 
	
	private final InstructorRepository instructorRepository;
	
	//Autowire the constructor with the repository
	@Autowired
	public CourseService(CourseRepository courseRepository, InstructorRepository instructorRepository) {
		
		this.courseRepository = courseRepository;
		this.instructorRepository = instructorRepository;
		
	}
	
	//CREATE: Logic to add a course
	public Course addCourse(Course course) {
		
		
		if(course.getInstructorID()== null) throw new RuntimeException("Instructor ID is required");
		
		Course newCourse = new Course();
		
		//get the instructor of this course
		Instructor instructor = instructorRepository.findById(course.getInstructorID())
													.orElseThrow(()-> new NoSuchElementException("Instructor doesn't exist"));
		
		newCourse.setTitle(course.getTitle());
		newCourse.setDescription(course.getDescription());
		newCourse.setCategory(course.getCategory());
		newCourse.setInstructor(instructor);
		newCourse.setDuration(course.getDuration());
		newCourse.setLevel(course.getLevel());
		newCourse.setLanguage(course.getLanguage());
		newCourse.setPublishedDate(course.getPublishedDate());
		
		return courseRepository.save(newCourse);
		
	}
	
	
	//READ: Logic to list all the courses
	public List<Course> getAllCourses(){
		
		return courseRepository.findAll();
		
	}
	
	
	//READ: Logic to list a course by ID
	public Course getCourseById(Long id) {
		
		return courseRepository.findById(id)
				.orElseThrow(()-> new NoSuchElementException("The course with the given ID doesn't exist"));
		
	}
	
	//UPDATE: update a course by ID
	
	public Course updateCourse(Long id, Course course) {
		
		Course oldCourse = courseRepository.findById(id).orElseThrow(()-> new NoSuchElementException("Can't find this course"));
	
		oldCourse.setTitle(course.getTitle());
		oldCourse.setDescription(course.getDescription());
		oldCourse.setCategory(course.getCategory());
		oldCourse.setInstructor(course.getInstructor());
		oldCourse.setDuration(course.getDuration());
		oldCourse.setLevel(course.getLevel());
		oldCourse.setLanguage(course.getLanguage());
		oldCourse.setPublishedDate(course.getPublishedDate());
		
		Course updatedCourse = courseRepository.save(oldCourse);
		
		return updatedCourse;
			
	}
	
	//DELETE: delete a course by Id
	public void deleteCourse(Long id) {
		
		courseRepository.deleteById(id);
		
	}
	
	
	
}

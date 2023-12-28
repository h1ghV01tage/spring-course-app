package com.example.course.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.model.Instructor;
import com.example.course.repository.InstructorRepository;

@Service
public class InstructorService {

	private final InstructorRepository instructorRepository;
	
	@Autowired
	public InstructorService(InstructorRepository instructorRepository) {
		// TODO Auto-generated constructor stub
		
		this.instructorRepository = instructorRepository;
		
	}
	
	//CREATE: add an instructor
	public Instructor addInstructor(Instructor instructor) {
		
		Instructor newInstructor = new Instructor();
		
		newInstructor.setName(instructor.getName());
		newInstructor.setEmail(instructor.getEmail());
		newInstructor = instructorRepository.save(newInstructor);
		
		return newInstructor;
				
	}
	
	
	//READ: list all the instructors
	public List<Instructor> getAllInstructors(){
		
		return instructorRepository.findAll();
		
	}
	
	//READ: Get an instructor by ID
	public Instructor getInstructorById(Long id) {
		
		Instructor instructor = instructorRepository.findById(id)
													.orElseThrow(()-> new NoSuchElementException("Can't find the instructor with that ID"));
		
		return instructor;
	}
	
	//UPDATE: update an instructor
	public Instructor updateInstructor(Long id,Instructor InstructorDetails) {
		
		Instructor instructor = instructorRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Instructor not found"));
	
		instructor.setName(InstructorDetails.getName());
		instructor.setEmail(InstructorDetails.getEmail());
		
		return instructorRepository.save(instructor);
		
		
	}
	
	//DELETE:Doesn't return anything
	public void deleteInstructor(Long id) {
		
		Instructor instructor = instructorRepository.findById(id)
				.orElseThrow(()-> new NoSuchElementException("Instructor doesn't exist"));
		
		instructorRepository.delete(instructor);
		
		
	}
	
	
	
}

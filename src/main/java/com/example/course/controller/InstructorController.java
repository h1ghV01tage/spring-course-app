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
import org.springframework.web.bind.annotation.RestController;

import com.example.course.model.Instructor;
import com.example.course.service.InstructorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/api/instructors")
public class InstructorController {

	private final InstructorService instructorService;
	
	@Autowired
	public InstructorController(InstructorService instructorService) {
		// TODO Auto-generated constructor stub
	
		this.instructorService = instructorService;
		
	}
	
	// CREATE: add an instructor
	@PostMapping(value = "/save")
	public ResponseEntity<?> addInstructor(@Valid @RequestBody Instructor instructor) {
		
			Instructor savedInstructor = instructorService.addInstructor(instructor);
			
			return ResponseEntity.ok(savedInstructor);
			
	}

	//READ: get all instructors
	@GetMapping(value = "/findall")
	public ResponseEntity<List<Instructor>> getAllInstructors(){
		
		List<Instructor> instructorsList = instructorService.getAllInstructors();
		
		return ResponseEntity.ok(instructorsList);
		
	}
	
	//READ: get an instructor by ID
	@GetMapping(value = "/find/{id}")
	public ResponseEntity<Instructor> getInstructorById(@Valid @PathVariable(value = "id") Long id){
		
		Instructor instructor = instructorService.getInstructorById(id);
		
		return ResponseEntity.ok(instructor);
		
	}
	
	//UPDATE: update existing instructor
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Instructor> updateInstructor(@Valid @PathVariable(value = "id") Long id, @Valid @RequestBody Instructor instructor){
		
		Instructor newInstructor = instructorService.updateInstructor(id, instructor);
		
		return ResponseEntity.ok(newInstructor);
		
	}
	
	
	//DELETE: remove an exisiting instructor
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> deleteInstructor(@PathVariable(value = "id") Long id) {
		
		try {
			
			instructorService.deleteInstructor(id);
			return ResponseEntity.ok("Successfuly deleted instructor");
			
		}
		
		catch(Exception e) {
			
			return ResponseEntity.internalServerError().body("Can't find an instructor with that ID");
			
		}
		
		
		
		
		
	}
	
}

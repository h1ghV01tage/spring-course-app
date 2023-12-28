package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.course.model.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

	
	
	
}

package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.model.Course;
import com.example.course.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {

	
	
}

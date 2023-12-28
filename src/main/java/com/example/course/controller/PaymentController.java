package com.example.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.repository.PaymentRepository;

@RestController
public class PaymentController {

	private final PaymentRepository paymentRepository;
	
	@Autowired
	public PaymentController(PaymentRepository paymentRepository) {
		// TODO Auto-generated constructor stub
		
		this.paymentRepository = paymentRepository;
		
	}
	
}

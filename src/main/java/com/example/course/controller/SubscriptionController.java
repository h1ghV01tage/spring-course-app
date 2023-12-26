package com.example.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.service.SubscriptionService;

@RestController
public class SubscriptionController {

	private final SubscriptionService subscriptionService;
	
	@Autowired
	public SubscriptionController(SubscriptionService subscriptionService) {
		// TODO Auto-generated constructor stub
		this.subscriptionService = subscriptionService;
		
	}
	
}

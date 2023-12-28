package com.example.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.course.repository.SubscriptionRepository;

@Service
public class SubscriptionService {

	private final SubscriptionRepository subscriptionRepository;
	
	@Autowired
	public SubscriptionService(SubscriptionRepository subscriptionRepository) {
		// TODO Auto-generated constructor stub
		
		this.subscriptionRepository = subscriptionRepository;
		
	}
	
}

package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.model.Course;
import com.example.course.model.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, String> {

	
	
}

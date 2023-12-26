package com.example.course.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="courses")
public class Course {
	
	@Id
	@Column(name="courseID")
	private String courseID;
	
	@Column(name="title", nullable = false, length = 100)
	private String title;
	
	@Column(name="description", columnDefinition = "Text")
	private String description;
	
	@Column(name="category", nullable = false, length = 50)
	private String category;
	
	@Column(name="instructorID", nullable = false)
	private String instructorID;
	
	@Column(name="duration", length = 20)
	private String duration;
	
	@Column(name="level", length = 20)
	private String level;
	
	@Column(name="language", length = 20)
	private String language;
	
	@Temporal(TemporalType.DATE)
	@Column(name="publishedDate")
	private String publishedDate;
		
}

package com.example.course.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@Entity
@Table(name="courses")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseID;
	
	@Transient
	private Long instructorID;
	
	@NotBlank(message="Title is required")
	@Size(message="Title must be less than 100 characters")
	@Column(name="title", nullable = false, length = 100)
	private String title;
	
	@NotBlank(message = "Description is required")
	@Column(name="description", columnDefinition = "Text")
	private String description;
	
	@NotBlank(message = "Category is required")
	@Column(name="category", nullable = false, length = 50)
	private String category;
	
	@ManyToOne
	@JoinColumn(name="instructorID")
	private Instructor instructor;
	
	@NotBlank(message = "Course Duration is required")
	@Column(name="duration", length = 20)
	private String duration;
	
	@NotBlank(message = "The course level can't be blank")
	@Column(name="level", length = 20)
	private String level;
	
	@NotBlank(message = "The course language is required")
	@Column(name="language", length = 20)
	private String language;
	
	@Temporal(TemporalType.DATE)
	@Column(name="publishedDate")
	private String publishedDate;
		
}

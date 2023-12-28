package com.example.course.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="instructors")
public class Instructor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "The instructor name must be provided")
	@Column(name = "name", nullable = false)
	private String name;
	
	@NotBlank(message = "The instructor email must be provided")
	@Column(name = "email", nullable = false, unique = true)
	@Email(message = "Invalid email format")
	private String email;
	
}

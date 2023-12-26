package com.example.course.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user_assessments")
public class UserAssessment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Assuming a generated value

    @Column(name = "userID", nullable = false)
    private String userId;

    @Column(name = "quizID", nullable = false)
    private String quizId;

    @Column(name = "response", length = 100)
    private String response;

    @Column(name = "score")
    private int score;

    @Column(name = "timestamp")
    private Timestamp timestamp;
        
}

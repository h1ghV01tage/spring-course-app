package com.example.course.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "quizzes")
public class Quiz {

    @Id
    @Column(name = "quizID")
    private String quizId;

    @Column(name = "courseID", nullable = false)
    private String courseId;

    @Column(name = "question", columnDefinition = "TEXT")
    private String question;

    @Column(name = "options", columnDefinition = "TEXT")
    private String options;

    @Column(name = "correctAnswer", length = 100)
    private String correctAnswer;
}

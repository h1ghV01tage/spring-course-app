package com.example.course.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "userID")
    private String userId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "passwordHash", nullable = false, length = 256)
    private String passwordHash;

    @Column(name = "role", nullable = false, length = 20)
    private String role;

    @Temporal(TemporalType.DATE)
    @Column(name = "joinDate")
    private Date joinDate;
    
}
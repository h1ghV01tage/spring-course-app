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
@Table(name="subscriptions")
public class Subscription {

    @Id
    @Column(name = "subscriptionID")
    private String subscriptionId;

    @Column(name = "userID", nullable = false)
    private String userId;

    @Column(name = "planID", nullable = false)
    private String planId;

    @Temporal(TemporalType.DATE)
    @Column(name = "startDate")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "endDate")
    private Date endDate; 
    
}

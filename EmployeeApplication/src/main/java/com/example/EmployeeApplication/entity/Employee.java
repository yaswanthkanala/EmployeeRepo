package com.example.EmployeeApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
   private Integer id;
   private String name;
   private Long mobileNumber;
   private String emailAddress;
}

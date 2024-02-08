package com.attendance.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String studentName;
    private String indexNo;
    @ManyToMany(mappedBy = "students")
    private Set<Attendance> attendances;
}

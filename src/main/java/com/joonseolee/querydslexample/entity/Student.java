package com.joonseolee.querydslexample.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private int age;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false)
    private int score;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    public Student() {}
    public Student(String name, int age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}

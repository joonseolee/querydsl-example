package com.joonseolee.querydslexample.domain.student;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.joonseolee.querydslexample.domain.school.School;
import com.joonseolee.querydslexample.domain.type.SexType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(
        name = "NAME",
        columnNames = {"name"}
)})
public class Student {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private SexType sexType;

    @Column
    private int age;

    @Column(nullable = false)
    private int grade;

    @Column(nullable = false)
    private int score;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDateTime;

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
    public Student(String name, SexType sexType, int age, int grade, int score, School school) {
        this.name = name;
        this.sexType = sexType;
        this.age = age;
        this.grade = grade;
        this.score = score;
        this.createdDateTime = new Date();
        this.school = school;
    }
}

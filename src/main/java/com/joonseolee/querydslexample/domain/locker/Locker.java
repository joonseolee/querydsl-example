package com.joonseolee.querydslexample.domain.locker;

import com.joonseolee.querydslexample.domain.student.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
public class Locker {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String json;

    @OneToOne(mappedBy = "locker")
    private Student student;
}

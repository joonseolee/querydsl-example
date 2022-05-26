package com.joonseolee.querydslexample.domain.student;

import com.joonseolee.querydslexample.domain.student.Student;

import java.util.List;

public interface StudentQueryRepository {
    List<Student> findBySimilarName(String name);
}

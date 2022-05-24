package com.joonseolee.querydslexample.repository;

import com.joonseolee.querydslexample.entity.Student;

import java.util.List;

public interface StudentQueryRepository {
    List<Student> findBySimilarName(String name);
}

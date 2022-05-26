package com.joonseolee.querydslexample.service;

import com.joonseolee.querydslexample.domain.school.SchoolService;
import com.joonseolee.querydslexample.domain.student.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolServiceTest {

    @Autowired
    private StudentService studentService;

    @Autowired
    private SchoolService schoolService;
    @Test
    void printSomething() {
        var students = studentService.findAll();
        var schools = schoolService.findAll();
        System.out.println("helele");
    }
}
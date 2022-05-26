package com.joonseolee.querydslexample.controller;

import com.joonseolee.querydslexample.domain.student.Student;
import com.joonseolee.querydslexample.domain.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findStudents(@RequestParam(required = false) String name) {
        if (name == null)
            return studentService.findAll();
        return studentService.findByName(name);
    }
}

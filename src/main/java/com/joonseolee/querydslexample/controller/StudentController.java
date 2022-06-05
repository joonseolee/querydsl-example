package com.joonseolee.querydslexample.controller;

import com.joonseolee.querydslexample.domain.student.Student;
import com.joonseolee.querydslexample.domain.student.StudentService;
import com.joonseolee.querydslexample.domain.student.dto.SavedStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> saveStudent(@RequestBody SavedStudent.Request request) {
        studentService.insertStudent(request);
        return ResponseEntity.ok().build();
    }
}

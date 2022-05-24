package com.joonseolee.querydslexample.service;

import com.joonseolee.querydslexample.entity.School;
import com.joonseolee.querydslexample.entity.Student;
import com.joonseolee.querydslexample.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public List<Student> findByName(String name) {
        var students = studentRepository.findBySimilarName(name);
        var school = students.get(0);

        return students;
    }

    public void insertStudent(Student student) {
        studentRepository.save(student);
    }
    public void insertStudent(String name, int age, School school) {
        var student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setSchool(school);
        studentRepository.save(student);
    }
}

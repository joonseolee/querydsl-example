package com.joonseolee.querydslexample.domain.student;

import com.joonseolee.querydslexample.domain.school.School;
import com.joonseolee.querydslexample.domain.school.SchoolRepository;
import com.joonseolee.querydslexample.domain.student.dto.SavedStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final SchoolRepository schoolRepository;
    private final StudentMapper studentMapper;

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

    public void insertStudent(SavedStudent.Request request) {
        School school = schoolRepository.findById(request.getSchoolId()).orElseThrow();
        Student student = studentMapper.toStudent(request);
        student.setSchool(school);
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

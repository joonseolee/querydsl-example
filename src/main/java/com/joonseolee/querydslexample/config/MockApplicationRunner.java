package com.joonseolee.querydslexample.config;

import com.joonseolee.querydslexample.entity.School;
import com.joonseolee.querydslexample.entity.Student;
import com.joonseolee.querydslexample.service.SchoolService;
import com.joonseolee.querydslexample.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class MockApplicationRunner implements ApplicationRunner {

    private final SchoolService schoolService;
    private final StudentService studentService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        var school1 = new School("a", "suwon");
        var school2 = new School("b", "seoul");

        var student11 = new Student("joonseo", 10, school1);
        var student12 = new Student("joonha", 12, school1);

        var student21 = new Student("joonseo2", 11, school2);
        var student22 = new Student("joonha2", 15, school2);

        schoolService.insertSchool(school1);
        schoolService.insertSchool(school2);

        studentService.insertStudent(student11);
        studentService.insertStudent(student12);
        studentService.insertStudent(student21);
        studentService.insertStudent(student22);
    }
}

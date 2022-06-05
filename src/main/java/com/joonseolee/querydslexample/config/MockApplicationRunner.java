package com.joonseolee.querydslexample.config;

import com.joonseolee.querydslexample.domain.school.School;
import com.joonseolee.querydslexample.domain.student.Student;
import com.joonseolee.querydslexample.domain.school.SchoolService;
import com.joonseolee.querydslexample.domain.student.StudentService;
import com.joonseolee.querydslexample.domain.type.SexType;
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

        var student11 = new Student("joonseo", SexType.MALE, 10, 1, 100, school1);
        var student12 = new Student("joonha", SexType.FEMALE, 10, 2, 90, school1);

        var student21 = new Student("joonseo2", SexType.MALE, 10, 3, 70, school2);
        var student22 = new Student("joonha2", SexType.FEMALE, 15, 4, 50, school2);

        schoolService.insertSchool(school1);
        schoolService.insertSchool(school2);

        studentService.insertStudent(student11);
        studentService.insertStudent(student12);
        studentService.insertStudent(student21);
        studentService.insertStudent(student22);
    }
}

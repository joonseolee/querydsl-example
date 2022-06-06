package com.joonseolee.querydslexample.repository;

import com.joonseolee.querydslexample.config.DatasourceConfig;
import com.joonseolee.querydslexample.domain.school.SchoolRepository;
import com.joonseolee.querydslexample.domain.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Sql("classpath:student.sql")
@DataJpaTest
@Import(DatasourceConfig.class)
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SchoolRepository schoolRepository;

    @Test
    void printStudents() {
        var students = studentRepository.findBySimilarName("joon");

        var schools = schoolRepository.findAll();
        var school1 = schools.get(0);
        var school2 = schools.get(1);
        var school3 = schools.get(2);
        System.out.println("value >>> " + school1.getName());
        System.out.println("value >>> " + school2.getName());
        assertThat(students.size(), is(7));
    }


    @Test
    void whenSelectByIdClass_thenPrintStudent() {
        studentRepository.doSomething();
    }
}
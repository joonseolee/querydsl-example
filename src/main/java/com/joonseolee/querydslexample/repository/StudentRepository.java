package com.joonseolee.querydslexample.repository;

import com.joonseolee.querydslexample.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>, StudentQueryRepository {
}

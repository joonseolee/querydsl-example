package com.joonseolee.querydslexample.domain.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>, StudentQueryRepository {
}

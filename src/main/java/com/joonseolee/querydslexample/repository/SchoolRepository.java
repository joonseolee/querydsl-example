package com.joonseolee.querydslexample.repository;

import com.joonseolee.querydslexample.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long>, SchoolQueryRepository {
}

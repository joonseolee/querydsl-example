package com.joonseolee.querydslexample.domain.school;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long>, SchoolQueryRepository {
}

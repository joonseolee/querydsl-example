package com.joonseolee.querydslexample.domain.school;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface SchoolRepository extends JpaRepository<School, Long>, SchoolQueryRepository, JpaSpecificationExecutor<School> {
}

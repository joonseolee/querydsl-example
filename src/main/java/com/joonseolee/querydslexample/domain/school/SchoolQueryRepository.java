package com.joonseolee.querydslexample.domain.school;

import com.joonseolee.querydslexample.domain.school.School;

import java.time.LocalDate;
import java.util.List;

public interface SchoolQueryRepository {

    List<School> findByCertainDate(LocalDate localDate);
}

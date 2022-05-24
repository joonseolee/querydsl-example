package com.joonseolee.querydslexample.repository;

import com.joonseolee.querydslexample.entity.School;

import java.time.LocalDate;
import java.util.List;

public interface SchoolQueryRepository {

    List<School> findByCertainDate(LocalDate localDate);
}

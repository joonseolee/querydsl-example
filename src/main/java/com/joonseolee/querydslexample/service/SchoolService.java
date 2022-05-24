package com.joonseolee.querydslexample.service;

import com.joonseolee.querydslexample.entity.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.joonseolee.querydslexample.repository.SchoolRepository;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public List<School> findSomething(LocalDate localDate) {
        return schoolRepository.findByCertainDate(localDate);
    }

    public void insertSchool(School school) {
        schoolRepository.save(school);
    }

    public void insertSchool(String name, String address) {
        var school = new School(name, address);
        schoolRepository.save(school);
    }

    public List<School> findAll() {
        return schoolRepository.findAll();
    }
}

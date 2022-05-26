package com.joonseolee.querydslexample.controller;

import com.joonseolee.querydslexample.domain.school.School;
import com.joonseolee.querydslexample.domain.school.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/schools")
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping
    public List<School> getSchoolsByCertainDate(@RequestParam LocalDate localDate) {
        return schoolService.findSomething(localDate);
    }

    @GetMapping("/all")
    public List<School> getSchools() {
        return schoolService.findAll();
    }

    @GetMapping("/dummy")
    public ResponseEntity<?> dummyInsert() {
        schoolService.insertSchool("a", "aa");
        schoolService.insertSchool("b", "bb");
        schoolService.insertSchool("c", "cc");
        schoolService.insertSchool("d", "dd");
        schoolService.insertSchool("e", "ee");
        return ResponseEntity.ok().build();
    }
}

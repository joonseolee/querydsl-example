package com.joonseolee.querydslexample.controller;

import com.joonseolee.querydslexample.domain.school.School;
import com.joonseolee.querydslexample.domain.school.SchoolService;
import com.joonseolee.querydslexample.domain.school.dto.SchoolNameAddress;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/schools")
public class SchoolController {

    private final SchoolService schoolService;

    @PostMapping
    public List<School> getSchoolsByConditions(@RequestBody SchoolNameAddress.Request request) {
        return schoolService.findByConditions(request);
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

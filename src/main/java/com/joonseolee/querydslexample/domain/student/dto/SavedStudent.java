package com.joonseolee.querydslexample.domain.student.dto;

import com.joonseolee.querydslexample.domain.type.SexType;
import lombok.AllArgsConstructor;
import lombok.Getter;

public class SavedStudent {

    private SavedStudent() {}

    @AllArgsConstructor
    @Getter
    public static class Request {
        private final String name;
        private final SexType sexType;
        private final int age;
        private final int grade;
        private final int score;
        private final long schoolId;
    }
}

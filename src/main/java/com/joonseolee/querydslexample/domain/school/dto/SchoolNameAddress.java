package com.joonseolee.querydslexample.domain.school.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;

public class SchoolNameAddress {

    private SchoolNameAddress() {}

    @Getter
    public static class Response {
        private final String name;
        private final String address;

        @QueryProjection
        public Response(String name, String address) {
            this.name = name;
            this.address = address;
        }
    }
}

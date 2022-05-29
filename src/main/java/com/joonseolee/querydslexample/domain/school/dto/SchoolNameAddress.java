package com.joonseolee.querydslexample.domain.school.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

public final class SchoolNameAddress {

    private SchoolNameAddress() {}

    @Getter
    @RequiredArgsConstructor
    public static class Request {
        private final Long id;
        private final String name;
        private final String address;
    }

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

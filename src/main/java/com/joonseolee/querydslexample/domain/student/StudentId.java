package com.joonseolee.querydslexample.domain.student;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class StudentId implements Serializable {
    private static final long serialVersionUID = 3031811697814320306L;

    private long id;
    private String name;

    public StudentId() {}
    public StudentId(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

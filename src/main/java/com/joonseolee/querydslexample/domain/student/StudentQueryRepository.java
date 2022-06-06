package com.joonseolee.querydslexample.domain.student;

import java.util.List;

public interface StudentQueryRepository {
    List<Student> findBySimilarName(String name);
    void doSomething();
}

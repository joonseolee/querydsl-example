package com.joonseolee.querydslexample.repository;

import com.joonseolee.querydslexample.entity.Student;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.joonseolee.querydslexample.entity.QStudent.student;

@RequiredArgsConstructor
@Repository
public class StudentQueryRepositoryImpl implements StudentQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Student> findBySimilarName(String name) {
        return jpaQueryFactory.selectFrom(student)
                .where(new BooleanBuilder().and(student.name.contains(name)))
                .fetch();
    }

    public List<Student> findByScoreAndGrade(int grade, int score) {
        return null;
    }
}

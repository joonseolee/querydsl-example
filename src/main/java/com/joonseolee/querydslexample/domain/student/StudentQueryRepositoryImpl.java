package com.joonseolee.querydslexample.domain.student;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static com.joonseolee.querydslexample.domain.student.QStudent.student;

@Slf4j
@RequiredArgsConstructor
@Repository
public class StudentQueryRepositoryImpl implements StudentQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final EntityManager entityManager;

    @Override
    public List<Student> findBySimilarName(String name) {
        return jpaQueryFactory.selectFrom(student)
                .where(new BooleanBuilder().and(student.name.contains(name)))
                .fetch();
    }

    @Override
    public void doSomething() {
        var studentId = new StudentId(1L, "joonseo");
        var student = entityManager.find(Student.class, studentId);
        log.info("student -> " + student.toString());
    }

    @Override
    public List<Student> findByNoFetch() {
        var students = entityManager.createQuery("SELECT s FROM Student s JOIN s.school", Student.class).getResultList();
        students.forEach(it -> log.info("student id - [{}], name - [{}]", it.getId(), it.getName()));
        return students;
    }

    @Override
    public List<Student> findByFetch() {
        var students = entityManager.createQuery("SELECT s FROM Student s JOIN FETCH s.school", Student.class).getResultList();
        students.forEach(it -> log.info("student id - [{}], name - [{}]", it.getId(), it.getName()));
        return students;
    }

    public List<Student> findByScoreAndGrade(int grade, int score) {
        return null;
    }
}

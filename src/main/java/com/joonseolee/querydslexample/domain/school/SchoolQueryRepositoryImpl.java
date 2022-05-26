package com.joonseolee.querydslexample.domain.school;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

import static com.joonseolee.querydslexample.entity.QSchool.school;

@RequiredArgsConstructor
@Repository
public class SchoolQueryRepositoryImpl implements SchoolQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<School> findByCertainDate(LocalDate localDate) {
        var builder = new BooleanBuilder();
        builder.and(school.createdDate.after(localDate));
        return jpaQueryFactory.selectFrom(school).where(builder).fetch();
    }
}

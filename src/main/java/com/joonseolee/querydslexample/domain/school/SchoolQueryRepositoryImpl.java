package com.joonseolee.querydslexample.domain.school;

import com.joonseolee.querydslexample.domain.school.dto.QSchoolNameAddress_Response;
import com.joonseolee.querydslexample.domain.school.dto.SchoolNameAddress;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.List;

import static com.joonseolee.querydslexample.domain.school.QSchool.school;


@RequiredArgsConstructor
@Repository
public class SchoolQueryRepositoryImpl implements SchoolQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;
    private final EntityManager entityManager;

    @Override
    public List<School> findByCertainDate(LocalDate localDate) {
        var builder = new BooleanBuilder();
        builder.and(school.createdDate.after(localDate));
        return jpaQueryFactory.selectFrom(school).where(builder).fetch();
    }

    @Override
    public SchoolNameAddress.Response findNameAddressByIdUsingProjections(long id) {
        return jpaQueryFactory.select(
                new QSchoolNameAddress_Response(
                        school.name,
                        school.address))
                .from(school)
                .where(school.id.eq(id))
                .fetchFirst();
    }

    @Override
    public void multipleUpdate(String newAddress) {
        jpaQueryFactory.update(school).set(school.address, newAddress).execute();
        entityManager.clear();
    }
}

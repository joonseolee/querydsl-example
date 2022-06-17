package com.joonseolee.querydslexample.domain.parcel;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.joonseolee.querydslexample.domain.parcel.QParcel.parcel;

@RequiredArgsConstructor
@Repository
public class ParcelQueryRepositoryImpl implements ParcelQueryRepository {

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<Parcel> findBySameCity(String city) {
        return jpaQueryFactory.selectFrom(parcel)
                .where(parcel.address.city.eq(city))
                .fetch();
    }
}

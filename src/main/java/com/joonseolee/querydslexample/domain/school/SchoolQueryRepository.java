package com.joonseolee.querydslexample.domain.school;

import com.joonseolee.querydslexample.domain.school.dto.SchoolNameAddress;

import java.time.LocalDate;
import java.util.List;

public interface SchoolQueryRepository {

    List<School> findByCertainDate(LocalDate localDate);

    /**
     * 생성자 갯수는 파악할수있지만 타입은 모름
     * @param id
     * @return
     */
    SchoolNameAddress.Response findNameAddressByIdUsingProjections(long id);

    void multipleUpdate(String newAddress);
}

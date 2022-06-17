package com.joonseolee.querydslexample.domain.parcel;

import com.joonseolee.querydslexample.config.DatasourceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Sql("classpath:parcel.sql")
@DataJpaTest
@Import(DatasourceConfig.class)
class ParcelRepositoryTest {

    @Autowired
    private ParcelRepository parcelRepository;

    @Test
    void whenFindAll_thenPrint() {
        var parcels = parcelRepository.findAll();

        assertEquals(4, parcels.size());
    }

    @Test
    void whenFindBySameCity_thenPrint() {
        var parcels = parcelRepository.findBySameCity("seoul");

        assertEquals(2, parcels.size());
    }
}
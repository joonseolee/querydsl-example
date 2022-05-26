package com.joonseolee.querydslexample.domain.school;

import com.joonseolee.querydslexample.config.DatasourceConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.jdbc.Sql;

import static org.junit.jupiter.api.Assertions.*;

@Sql("classpath:student.sql")
@DataJpaTest
@Import(DatasourceConfig.class)
class SchoolRepositoryTest {

    @Autowired
    private SchoolRepository schoolRepository;

    @Test
    void whenFindNameAddressByIdUsingProjections_thenSuccess() {
        var object = schoolRepository.findNameAddressByIdUsingProjections(3L);

        assertNotEquals(null, object);
        assertEquals("aq", object.getName());
        assertEquals("a2", object.getAddress());
    }
}
package com.joonseolee.querydslexample.domain.school;

import com.joonseolee.querydslexample.domain.school.dto.SchoolNameAddress;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SchoolSpecRepositoryImpl {

    private SchoolSpecRepositoryImpl() {}

    public static Specification<School> findByConditions(SchoolNameAddress.Request request) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if (!Objects.isNull(request.getId())) {
                predicates.add(criteriaBuilder.equal(root.get("id"), request.getId()));
            }
            if (!Objects.isNull(request.getName())) {
                predicates.add(criteriaBuilder.equal(root.get("name"), request.getName()));
            }
            if (!Objects.isNull(request.getAddress())) {
                predicates.add(criteriaBuilder.equal(root.get("address"), request.getAddress()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}

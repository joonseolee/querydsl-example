package com.joonseolee.querydslexample.domain.parcel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel, Long>, ParcelQueryRepository {
}

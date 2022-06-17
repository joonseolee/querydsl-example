package com.joonseolee.querydslexample.domain.parcel;

import java.util.List;

public interface ParcelQueryRepository {

    List<Parcel> findBySameCity(String city);
}

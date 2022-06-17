package com.joonseolee.querydslexample.domain.parcel;

import java.util.List;

public interface ParcelService {

    Parcel save(Parcel parcel);

    List<Parcel> findAll();
}

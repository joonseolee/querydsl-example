package com.joonseolee.querydslexample.domain.parcel;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ParcelServiceImpl implements ParcelService {

    private final ParcelRepository parcelRepository;

    @Override
    public Parcel save(Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    @Override
    public List<Parcel> findAll() {
        return parcelRepository.findAll();
    }
}

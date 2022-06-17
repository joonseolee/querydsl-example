package com.joonseolee.querydslexample.controller;

import com.joonseolee.querydslexample.domain.parcel.Parcel;
import com.joonseolee.querydslexample.domain.parcel.ParcelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/parcels")
@RequiredArgsConstructor
@RestController
public class ParcelController {

    private final ParcelService parcelService;

    @GetMapping
    public List<Parcel> findAll() {
        return parcelService.findAll();
    }

    @PostMapping
    public Parcel save(@RequestBody Parcel parcel) {
        return parcelService.save(parcel);
    }
}

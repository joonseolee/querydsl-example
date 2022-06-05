package com.joonseolee.querydslexample.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

@MapperConfig(
        componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.WARN
)
public interface CommonMapper {
}

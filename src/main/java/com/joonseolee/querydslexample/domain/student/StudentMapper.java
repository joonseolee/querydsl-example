package com.joonseolee.querydslexample.domain.student;

import com.joonseolee.querydslexample.config.CommonMapper;
import com.joonseolee.querydslexample.domain.student.dto.SavedStudent;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        config = CommonMapper.class,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface StudentMapper {

    Student toStudent(SavedStudent.Request request);
}

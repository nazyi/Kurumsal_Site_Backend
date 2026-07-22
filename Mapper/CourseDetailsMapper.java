package com.example.projem.Mapper;

import com.example.projem.Dto.CourseDetailsDto;
import com.example.projem.Entity.CourseDetails;


public interface CourseDetailsMapper {

    CourseDetails toEntity(CourseDetailsDto courseDetailsDto);

    CourseDetailsDto toDTO(CourseDetails courseDetails);



}

package com.example.projem.Mapper;


import com.example.projem.Dto.CourseDto;
import com.example.projem.Entity.Course;


public interface CourseMapper {

    Course toEntity(CourseDto courseDto);

    CourseDto toDTO(Course course);



}

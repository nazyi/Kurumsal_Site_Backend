package com.example.projem.Mapper;

import com.example.projem.Dto.CourseDto;
import com.example.projem.Entity.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapperImplements implements CourseMapper{

    @Override
     public CourseDto toDTO(Course course){
        CourseDto courseDto = new CourseDto();
        courseDto.setCourse_id(course.getCourse_id());
        courseDto.setCourse_desc(course.getCourse_desc());
        courseDto.setCourse_title(course.getCourse_title());
        courseDto.setCourse_img(course.getCourse_img());
        courseDto.setCourse_createdate(course.getCourse_createdate());
        courseDto.setCourse_updatedate(course.getCourse_updatedate());
        return courseDto;
    }

    @Override
    public Course toEntity(CourseDto courseDto){
        Course course = new Course();
        course.setCourse_id(courseDto.getCourse_id());
        course.setCourse_desc(courseDto.getCourse_desc());
        course.setCourse_title(courseDto.getCourse_title());
        course.setCourse_img(courseDto.getCourse_img());
        course.setCourse_createdate(courseDto.getCourse_createdate());
        course.setCourse_updatedate(courseDto.getCourse_updatedate());
        return course;

    }



}

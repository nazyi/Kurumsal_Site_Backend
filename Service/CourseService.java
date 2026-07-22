package com.example.projem.Service;

import com.example.projem.Dto.CourseDto;
import com.example.projem.Entity.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(CourseDto courseDto);

    CourseDto getCourseById(Long id);

    void deleteCourseById(Long id);

    List<Course> findAllCourse();

}

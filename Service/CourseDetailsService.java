package com.example.projem.Service;

import com.example.projem.Dto.CourseDetailsDto;
import com.example.projem.Entity.CourseDetails;

import java.util.List;

public interface CourseDetailsService {
    CourseDetails saveCourseDetails(CourseDetailsDto courseDetailsDto);

    CourseDetailsDto getCourseDetailsById(Long id);

    void deleteCourseDetailsById(Long id);

    List<CourseDetails> findAllCourseDetails();

}

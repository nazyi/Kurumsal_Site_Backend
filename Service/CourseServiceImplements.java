package com.example.projem.Service;

import com.example.projem.Dto.CourseDto;
import com.example.projem.Entity.Course;
import com.example.projem.Mapper.CourseMapper;
import com.example.projem.Repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplements implements CourseService{

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseServiceImplements(final CourseRepository courseRepository, final CourseMapper courseMapper){
        this.courseRepository=courseRepository;
        this.courseMapper=courseMapper;
    }


    @Override
    public Course saveCourse(CourseDto courseDto){
        return courseRepository.save(courseMapper.toEntity(courseDto));

    }

    @Override
    public CourseDto getCourseById(Long id){
        return courseMapper.toDTO(courseRepository.findById(id).get());
    }

    @Override
    public void deleteCourseById(Long id){
        courseRepository.deleteById(id);
    }

    @Override
    public List<Course> findAllCourse(){
        List<Course> courseList = courseRepository.findAll();
        return courseList;
    }




}

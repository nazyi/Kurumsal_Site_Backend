package com.example.projem.Service;

import com.example.projem.Dto.CourseDetailsDto;
import com.example.projem.Entity.CourseDetails;
import com.example.projem.Mapper.CourseDetailsMapper;
import com.example.projem.Repository.CourseDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDetailsServiceImplements implements CourseDetailsService{

    private final CourseDetailsRepository courseDetailsRepository;
    private final CourseDetailsMapper courseDetailsMapper;

    public CourseDetailsServiceImplements(final CourseDetailsRepository courseDetailsRepository, final CourseDetailsMapper courseDetailsMapper){
        this.courseDetailsRepository=courseDetailsRepository;
        this.courseDetailsMapper=courseDetailsMapper;
    }


    @Override
    public CourseDetails saveCourseDetails(CourseDetailsDto courseDetailsDto){
        return courseDetailsRepository.save(courseDetailsMapper.toEntity(courseDetailsDto));

    }

    @Override
    public CourseDetailsDto getCourseDetailsById(Long id){
        return courseDetailsMapper.toDTO(courseDetailsRepository.findById(id).get());
    }

    @Override
    public void deleteCourseDetailsById(Long id){
        courseDetailsRepository.deleteById(id);
    }

    @Override
    public List<CourseDetails> findAllCourseDetails(){
        List<CourseDetails> courseDetailsList = courseDetailsRepository.findAll();
        return courseDetailsList;
    }




}

package com.example.projem.Mapper;

import com.example.projem.Dto.CourseDetailsDto;
import com.example.projem.Entity.CourseDetails;
import org.springframework.stereotype.Component;

@Component
public class CourseDetailsMapperImplements implements CourseDetailsMapper{

    @Override
     public CourseDetailsDto toDTO(CourseDetails courseDetails){
        CourseDetailsDto courseDetailsDto = new CourseDetailsDto();
        courseDetailsDto.setCdetails_id(courseDetails.getCdetails_id());
        courseDetailsDto.setCdetails_desc(courseDetails.getCdetails_desc());
        courseDetailsDto.setCdetails_img(courseDetails.getCdetails_img());
        courseDetailsDto.setCdetails_title(courseDetails.getCdetails_title());
        courseDetailsDto.setCdetails_updatedate(courseDetails.getCdetails_updatedate());
        courseDetailsDto.setCdetails_createdate(courseDetails.getCdetails_createdate());
        return courseDetailsDto;
    }

    @Override
    public CourseDetails toEntity(CourseDetailsDto courseDetailsDto){
        CourseDetails courseDetails = new CourseDetails();
        courseDetails.setCdetails_id(courseDetailsDto.getCdetails_id());
        courseDetails.setCdetails_img(courseDetailsDto.getCdetails_img());
        courseDetails.setCdetails_desc(courseDetailsDto.getCdetails_desc());
        courseDetails.setCdetails_title(courseDetailsDto.getCdetails_title());
        courseDetails.setCdetails_updatedate(courseDetailsDto.getCdetails_updatedate());
        courseDetails.setCdetails_createdate(courseDetailsDto.getCdetails_createdate());
        return courseDetails;

    }



}

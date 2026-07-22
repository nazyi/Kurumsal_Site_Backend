package com.example.projem.Controller;



import com.example.projem.Dto.CourseDetailsDto;
import com.example.projem.Entity.CourseDetails;
import com.example.projem.Service.CourseDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseDetailsController {


    private final CourseDetailsService courseDetailsService;

    public CourseDetailsController(CourseDetailsService courseDetailsService){
        this.courseDetailsService=courseDetailsService;
    }

    @PostMapping("/savecoursedetails")
    public CourseDetails saveCourseDetails (@RequestBody CourseDetailsDto courseDetailsDto){
        return courseDetailsService.saveCourseDetails(courseDetailsDto);
    }

    @GetMapping("/getcoursedetailsbyid/{id}")
    public CourseDetailsDto getCourseDetailsById(@PathVariable(value = "id")Long id){
        return courseDetailsService.getCourseDetailsById(id);
    }

    @GetMapping("/getallcoursedetails")
    public List<CourseDetails> getAllCourseDetails(){
        return courseDetailsService.findAllCourseDetails();
    }

    @PutMapping("/updatecoursedetails/{id}")
    public CourseDetails updateCourseDetails(@PathVariable Long id,@RequestBody CourseDetailsDto courseDetailsDto){
        return courseDetailsService.saveCourseDetails(courseDetailsDto);
    }

    @DeleteMapping("/deletecoursedetailsbyid/{id}")
    public void deleteCourseDetailsById(@PathVariable Long id){
        courseDetailsService.deleteCourseDetailsById(id);

    }

}

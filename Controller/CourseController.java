package com.example.projem.Controller;



import com.example.projem.Dto.CourseDto;
import com.example.projem.Entity.Course;
import com.example.projem.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {


    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService=courseService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/savecourse")
    public Course saveCourse (@RequestBody CourseDto courseDto){
        return courseService.saveCourse(courseDto);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getcoursebyid/{id}")
    public CourseDto getCourseById(@PathVariable(value = "id")Long id){
        return courseService.getCourseById(id);
    }

    @GetMapping("/getallcourse")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Course> getAllCourse(){
        return courseService.findAllCourse();
    }

    @PutMapping("/updatecourse/{id}")
    public Course updateCourse(@PathVariable Long id,@RequestBody CourseDto courseDto){
        return courseService.saveCourse(courseDto);
    }

    @DeleteMapping("/deletecoursebyid/{id}")
    public void deleteCourseById(@PathVariable Long id){
        courseService.deleteCourseById(id);

    }

}

package com.example.projem.Controller;

import com.example.projem.Dto.AboutUsDto;
import com.example.projem.Entity.AboutUs;
import com.example.projem.Service.AboutUsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AboutUsController {


    private final AboutUsService aboutUsService;

    public AboutUsController(AboutUsService aboutUsService){
        this.aboutUsService=aboutUsService;
    }


    @PostMapping("/saveaboutus")
    public AboutUs saveAboutUs(@RequestBody AboutUsDto aboutUsDto){
        return aboutUsService.saveAboutUs(aboutUsDto);
    }

    @GetMapping("/getaboutusbyid/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public AboutUsDto getAboutUsId(@PathVariable(value = "id")Long id){
        return aboutUsService.getAboutUsById(id);
    }
    @GetMapping("/getallaboutus")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<AboutUs> getAllAboutUs(){
        return aboutUsService.findAllAboutUs();
    }

    @PutMapping("/updateaboutus/{id}")
    public AboutUs updateAboutUs(@PathVariable Long id,@RequestBody AboutUsDto aboutUsDto){
        return aboutUsService.saveAboutUs(aboutUsDto);
    }

    @DeleteMapping("/deleteaboutus/{id}")
    public void deleteAboutUsById(@PathVariable Long id){
        aboutUsService.deleteAboutUsById(id);

    }

}

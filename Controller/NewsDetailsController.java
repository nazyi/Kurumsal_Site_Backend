package com.example.projem.Controller;



import com.example.projem.Dto.NewsDetailsDto;
import com.example.projem.Entity.NewsDetails;
import com.example.projem.Service.NewsDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsDetailsController {


    private final NewsDetailsService newsDetailsService;

    public NewsDetailsController(NewsDetailsService newsDetailsService){
        this.newsDetailsService=newsDetailsService;
    }

    @PostMapping("/savenewsdetails")
    @CrossOrigin(origins = "http://localhost:3000")
    public NewsDetails saveNewsDetails (@RequestBody NewsDetailsDto newsDetailsDto){
        return newsDetailsService.saveNewsDetails(newsDetailsDto);
    }

    @GetMapping("/getnewsdetailsbyid/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public NewsDetailsDto getNewsDetailsById(@PathVariable(value = "id")Long id){
        return newsDetailsService.getNewsDetailsById(id);
    }

    @GetMapping("/getallnewsdetails")
    public List<NewsDetails> getAllNewsDetails(){
        return newsDetailsService.findAllNewsDetails();
    }

    @PutMapping("/updatenewsdetails/{id}")
    public NewsDetails updateNewsDetails(@PathVariable Long id,@RequestBody NewsDetailsDto newsDetailsDto){
        return newsDetailsService.saveNewsDetails(newsDetailsDto);
    }

    @DeleteMapping("/deletenewsdetailsbyid/{id}")
    public void deleteNewsDetailsById(@PathVariable Long id){
        newsDetailsService.deleteNewsDetailsById(id);

    }

}

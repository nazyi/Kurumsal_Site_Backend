package com.example.projem.Controller;




import com.example.projem.Dto.NewsDto;
import com.example.projem.Entity.News;
import com.example.projem.Service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {


    private final NewsService newsService;

    public NewsController(NewsService newsService){
        this.newsService=newsService;
    }

    @PostMapping("/savenews")
    public News saveNews(@RequestBody NewsDto newsDto){
        return newsService.saveNews(newsDto);
    }

    @GetMapping("/getnewsbyid/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public NewsDto getNewsById(@PathVariable(value = "id")Long id){
        return newsService.getNewsById(id);
    }

    @GetMapping("/getallnews")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<News> getAllNews(){
        return newsService.findAllNews();
    }

    @PutMapping("/updatenews/{id}")
    public News updateNews(@PathVariable Long id,@RequestBody NewsDto newsDto){
        return newsService.saveNews(newsDto);
    }

    @DeleteMapping("/deletenewsbyid/{id}")
    public void deleteNewsById(@PathVariable Long id){
        newsService.deleteNewsById(id);

    }

}

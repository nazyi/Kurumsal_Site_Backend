package com.example.projem.Service;


import com.example.projem.Dto.NewsDto;
import com.example.projem.Entity.News;
import com.example.projem.Mapper.NewsMapper;
import com.example.projem.Repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImplements implements NewsService{

    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    public NewsServiceImplements(final NewsRepository newsRepository, final NewsMapper newsMapper){
        this.newsRepository=newsRepository;
        this.newsMapper=newsMapper;
    }


    @Override
    public News saveNews(NewsDto newsDto){
        return newsRepository.save(newsMapper.toEntity(newsDto));

    }

    @Override
    public NewsDto getNewsById(Long id){
        return newsMapper.toDTO(newsRepository.findById(id).get());
    }

    @Override
    public void deleteNewsById(Long id){
        newsRepository.deleteById(id);
    }

    @Override
    public List<News> findAllNews(){
        List<News> newsList = newsRepository.findAll();
        return newsList;
    }




}

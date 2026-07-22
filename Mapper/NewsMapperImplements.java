package com.example.projem.Mapper;

import com.example.projem.Dto.NewsDto;
import com.example.projem.Entity.News;
import org.springframework.stereotype.Component;

@Component
public class NewsMapperImplements implements NewsMapper{

    @Override
     public NewsDto toDTO(News news){
        NewsDto newsDto = new NewsDto();
        newsDto.setNews_id(news.getNews_id());
        newsDto.setNews_desc(news.getNews_desc());
        newsDto.setNews_img(news.getNews_img());
        newsDto.setNews_title(news.getNews_title());
        newsDto.setNews_createdate(news.getNews_createdate());
        newsDto.setNews_updatedate(news.getNews_updatedate());
        return newsDto;
    }

    @Override
    public News toEntity(NewsDto newsDto){
        News news = new News();
        news.setNews_id(newsDto.getNews_id());
        news.setNews_desc(newsDto.getNews_desc());
        news.setNews_title(newsDto.getNews_title());
        news.setNews_img(newsDto.getNews_img());
        news.setNews_createdate(newsDto.getNews_createdate());
        news.setNews_updatedate(newsDto.getNews_updatedate());
        return news;

    }



}

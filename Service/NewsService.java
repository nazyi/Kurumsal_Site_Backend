package com.example.projem.Service;


import com.example.projem.Dto.NewsDto;
import com.example.projem.Entity.News;

import java.util.List;

public interface NewsService {
    News saveNews(NewsDto newsDto);

    NewsDto getNewsById(Long id);

    void deleteNewsById(Long id);

    List<News> findAllNews();

}

package com.example.projem.Mapper;

import com.example.projem.Dto.NewsDto;
import com.example.projem.Entity.News;


public interface NewsMapper {

    News toEntity(NewsDto newsDto);

    NewsDto toDTO(News news);



}

package com.example.projem.Service;

import com.example.projem.Dto.NewsDetailsDto;
import com.example.projem.Entity.NewsDetails;

import java.util.List;

public interface NewsDetailsService {
    NewsDetails saveNewsDetails(NewsDetailsDto newsDetailsDto);

    NewsDetailsDto getNewsDetailsById(Long id);

    void deleteNewsDetailsById(Long id);

    List<NewsDetails> findAllNewsDetails();

}

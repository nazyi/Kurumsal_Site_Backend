package com.example.projem.Service;

import com.example.projem.Dto.NewsDetailsDto;
import com.example.projem.Entity.NewsDetails;
import com.example.projem.Mapper.NewsDetailsMapper;
import com.example.projem.Repository.NewsDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsDetailsServiceImplements implements NewsDetailsService{

    private final NewsDetailsRepository newsDetailsRepository;
    private final NewsDetailsMapper newsDetailsMapper;

    public NewsDetailsServiceImplements(final NewsDetailsRepository newsDetailsRepository, final NewsDetailsMapper newsDetailsMapper){
        this.newsDetailsRepository=newsDetailsRepository;
        this.newsDetailsMapper=newsDetailsMapper;
    }


    @Override
    public NewsDetails saveNewsDetails(NewsDetailsDto newsDetailsDto){
        return newsDetailsRepository.save(newsDetailsMapper.toEntity(newsDetailsDto));

    }

    @Override
    public NewsDetailsDto getNewsDetailsById(Long id){
        return newsDetailsMapper.toDTO(newsDetailsRepository.findById(id).get());
    }

    @Override
    public void deleteNewsDetailsById(Long id){
        newsDetailsRepository.deleteById(id);
    }

    @Override
    public List<NewsDetails> findAllNewsDetails(){
        List<NewsDetails> newsDetailsList = newsDetailsRepository.findAll();
        return newsDetailsList;
    }




}

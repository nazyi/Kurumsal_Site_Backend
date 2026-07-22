package com.example.projem.Mapper;

import com.example.projem.Dto.NewsDetailsDto;
import com.example.projem.Entity.NewsDetails;
import org.springframework.stereotype.Component;

@Component
public class NewsDetailsMapperImplements implements NewsDetailsMapper{

    @Override
     public NewsDetailsDto toDTO(NewsDetails newsDetails){
        NewsDetailsDto newsDetailsDto = new NewsDetailsDto();
        newsDetailsDto.setNdetails_aut(newsDetails.getNdetails_aut());
        newsDetailsDto.setNdetails_id(newsDetails.getNdetails_id());
        newsDetailsDto.setNdetails_img(newsDetails.getNdetails_img());
        newsDetailsDto.setNdetails_desc(newsDetails.getNdetails_desc());
        newsDetailsDto.setNdetails_title(newsDetails.getNdetails_title());
        newsDetailsDto.setNdetails_createdate(newsDetails.getNdetails_createdate());
        newsDetailsDto.setNdetails_updatedate(newsDetails.getNdetails_updatedate());
        return newsDetailsDto;
    }

    @Override
    public NewsDetails toEntity(NewsDetailsDto newsDetailsDto){
        NewsDetails newsDetails = new NewsDetails();
        newsDetails.setNdetails_img(newsDetailsDto.getNdetails_img());
        newsDetails.setNdetails_id(newsDetailsDto.getNdetails_id());
        newsDetails.setNdetails_aut(newsDetailsDto.getNdetails_aut());
        newsDetails.setNdetails_title(newsDetailsDto.getNdetails_title());
        newsDetails.setNdetails_desc(newsDetailsDto.getNdetails_desc());
        newsDetails.setNdetails_createdate(newsDetailsDto.getNdetails_createdate());
        newsDetails.setNdetails_updatedate(newsDetailsDto.getNdetails_updatedate());
        return newsDetails;

    }



}

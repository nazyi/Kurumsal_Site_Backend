package com.example.projem.Mapper;

import com.example.projem.Dto.NewsDetailsDto;
import com.example.projem.Entity.NewsDetails;


public interface NewsDetailsMapper {

    NewsDetails toEntity(NewsDetailsDto newsDetailsDto);

    NewsDetailsDto toDTO(NewsDetails newsDetails);



}

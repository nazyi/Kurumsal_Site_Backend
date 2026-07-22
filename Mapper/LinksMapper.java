package com.example.projem.Mapper;


import com.example.projem.Dto.LinksDto;
import com.example.projem.Entity.Links;


public interface LinksMapper {

    Links toEntity(LinksDto linksDto);

    LinksDto toDTO(Links links);



}

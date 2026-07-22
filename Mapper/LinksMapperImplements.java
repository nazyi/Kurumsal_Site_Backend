package com.example.projem.Mapper;

import com.example.projem.Dto.LinksDto;
import com.example.projem.Entity.Links;
import org.springframework.stereotype.Component;

@Component
public class LinksMapperImplements implements LinksMapper{

    @Override
     public LinksDto toDTO(Links links){
        LinksDto linksDto = new LinksDto();
        linksDto.setLinks_id(links.getLinks_id());
        linksDto.setLinks_desc(links.getLinks_desc());
        linksDto.setLinks_name(links.getLinks_name());
        linksDto.setLinks_url(links.getLinks_url());
        linksDto.setLinks_createdate(links.getLinks_createdate());
        linksDto.setLinks_updatedate(links.getLinks_updatedate());
        return linksDto;
    }

    @Override
    public Links toEntity(LinksDto linksDto){
        Links links = new Links();
        links.setLinks_id(linksDto.getLinks_id());
        links.setLinks_name(linksDto.getLinks_name());
        links.setLinks_url(linksDto.getLinks_url());
        links.setLinks_desc(linksDto.getLinks_desc());
        links.setLinks_updatedate(linksDto.getLinks_updatedate());
        links.setLinks_createdate(linksDto.getLinks_createdate());
        return links;

    }



}

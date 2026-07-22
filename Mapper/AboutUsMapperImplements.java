package com.example.projem.Mapper;

import com.example.projem.Dto.AboutUsDto;
import com.example.projem.Entity.AboutUs;
import org.springframework.stereotype.Component;


@Component
public class AboutUsMapperImplements implements AboutUsMapper{

    @Override
     public AboutUsDto toDTO(AboutUs aboutUs){
        AboutUsDto aboutUsDto = new AboutUsDto();
        aboutUsDto.setAboutus_id(aboutUs.getAboutus_id());
        aboutUsDto.setAboutus_title(aboutUs.getAboutus_title());
        aboutUsDto.setAboutus_desc(aboutUs.getAboutus_desc());
        aboutUsDto.setAboutus_img(aboutUs.getAboutus_img());
        aboutUsDto.setAboutus_createdate(aboutUs.getAboutus_createdate());
        aboutUsDto.setAboutus_updatedate(aboutUs.getAboutus_updatedate());
        return aboutUsDto;
    }

    @Override
    public AboutUs toEntity(AboutUsDto aboutUsDto){
        AboutUs aboutUs = new AboutUs();
        aboutUs.setAboutus_id(aboutUsDto.getAboutus_id());
        aboutUs.setAboutus_title(aboutUsDto.getAboutus_title());
        aboutUs.setAboutus_desc(aboutUsDto.getAboutus_desc());
        aboutUs.setAboutus_img(aboutUsDto.getAboutus_img());
        aboutUs.setAboutus_createdate(aboutUsDto.getAboutus_createdate());
        aboutUs.setAboutus_updatedate(aboutUsDto.getAboutus_updatedate());
        return aboutUs;

    }



}

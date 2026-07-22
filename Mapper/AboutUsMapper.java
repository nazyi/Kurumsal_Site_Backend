package com.example.projem.Mapper;

import com.example.projem.Dto.AboutUsDto;
import com.example.projem.Entity.AboutUs;




public interface AboutUsMapper {

    AboutUs toEntity(AboutUsDto aboutUsDto);

    AboutUsDto toDTO(AboutUs aboutUs);



}

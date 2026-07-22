package com.example.projem.Service;

import com.example.projem.Dto.AboutUsDto;
import com.example.projem.Entity.AboutUs;

import java.util.List;

public interface AboutUsService {
    AboutUs saveAboutUs(AboutUsDto aboutUsDto);

    AboutUsDto getAboutUsById(Long id);

    void deleteAboutUsById(Long id);

    List<AboutUs> findAllAboutUs();

}

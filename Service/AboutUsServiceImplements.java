package com.example.projem.Service;

import com.example.projem.Dto.AboutUsDto;
import com.example.projem.Entity.AboutUs;
import com.example.projem.Mapper.AboutUsMapper;
import com.example.projem.Repository.AboutUsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutUsServiceImplements implements AboutUsService{

    private final AboutUsRepository aboutUsRepository;
    private final AboutUsMapper aboutUsMapper;

    public AboutUsServiceImplements(final AboutUsRepository aboutUsRepository,final AboutUsMapper aboutUsMapper){
        this.aboutUsRepository=aboutUsRepository;
        this.aboutUsMapper=aboutUsMapper;
    }


    @Override
    public AboutUs saveAboutUs(AboutUsDto aboutUsDto){
        return aboutUsRepository.save(aboutUsMapper.toEntity(aboutUsDto));

    }


    @Override
    public AboutUsDto getAboutUsById(Long id){
        return aboutUsMapper.toDTO(aboutUsRepository.findById(id).get());
    }

    @Override
    public void deleteAboutUsById(Long id){
        aboutUsRepository.deleteById(id);
    }

    @Override
    public List<AboutUs> findAllAboutUs(){
        List<AboutUs> aboutUsList = aboutUsRepository.findAll();
        return aboutUsList;
    }




}

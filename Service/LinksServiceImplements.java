package com.example.projem.Service;


import com.example.projem.Dto.LinksDto;
import com.example.projem.Entity.Links;
import com.example.projem.Mapper.LinksMapper;
import com.example.projem.Repository.LinksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinksServiceImplements implements LinksService{

    private final LinksRepository linksRepository;
    private final LinksMapper linksMapper;

    public LinksServiceImplements(final LinksRepository linksRepository, final LinksMapper linksMapper){
        this.linksRepository=linksRepository;
        this.linksMapper=linksMapper;
    }


    @Override
    public Links saveLinks(LinksDto linksDto){
        return linksRepository.save(linksMapper.toEntity(linksDto));

    }

    @Override
    public LinksDto getLinksById(Long id){
        return linksMapper.toDTO(linksRepository.findById(id).get());
    }

    @Override
    public void deleteLinksById(Long id){
        linksRepository.deleteById(id);
    }

    @Override
    public List<Links> findAllLinks(){
        List<Links> linksList = linksRepository.findAll();
        return linksList;
    }




}

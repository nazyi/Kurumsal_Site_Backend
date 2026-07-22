package com.example.projem.Service;


import com.example.projem.Dto.LinksDto;
import com.example.projem.Entity.Links;

import java.util.List;

public interface LinksService {
    Links saveLinks(LinksDto linksDto);

    LinksDto getLinksById(Long id);

    void deleteLinksById(Long id);

    List<Links> findAllLinks();

}

package com.example.projem.Controller;



import com.example.projem.Dto.LinksDto;
import com.example.projem.Entity.Links;
import com.example.projem.Service.LinksService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LinksController {


    private final LinksService linksService;

    public LinksController(LinksService linksService){
        this.linksService=linksService;
    }

    @PostMapping("/savelinks")
    public Links saveLinks (@RequestBody LinksDto linksDto){
        return linksService.saveLinks(linksDto);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getlinksbyid/{id}")
    public LinksDto getLinksById(@PathVariable(value = "id")Long id){
        return linksService.getLinksById(id);
    }

    @GetMapping("/getalllinks")
    public List<Links> getAllLinks(){
        return linksService.findAllLinks();
    }

    @PutMapping("/updatelinks/{id}")
    public Links updateLinks(@PathVariable Long id,@RequestBody LinksDto linksDto){
        return linksService.saveLinks(linksDto);
    }

    @DeleteMapping("/deletelinksbyid/{id}")
    public void deleteLinksyId(@PathVariable Long id){
        linksService.deleteLinksById(id);

    }

}

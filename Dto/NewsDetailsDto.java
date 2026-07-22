package com.example.projem.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class NewsDetailsDto {
    private Long ndetails_id;
    private String ndetails_title;
    private String ndetails_desc;
    private String ndetails_img;
    private String ndetails_createdate;
    private String ndetails_updatedate;
    private String ndetails_aut;
}

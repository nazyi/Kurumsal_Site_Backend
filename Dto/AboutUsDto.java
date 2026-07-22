package com.example.projem.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter

public class AboutUsDto {
    private Long aboutus_id;
    private String aboutus_title;
    private String aboutus_desc;
    private String aboutus_img;
    private String aboutus_createdate;
    private String aboutus_updatedate;



}

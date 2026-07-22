package com.example.projem.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Data
@Getter
@Setter
public class NewsDto {
    private Long news_id;
    private String news_title;
    private String news_desc;
    private String news_img;
    private String news_createdate;
    private String news_updatedate;

}

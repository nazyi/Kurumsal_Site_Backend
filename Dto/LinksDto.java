package com.example.projem.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class LinksDto {
    private Long links_id;
    private String links_url;
    private String links_name;
    private String links_desc;
    private String links_createdate;
    private String links_updatedate;

}

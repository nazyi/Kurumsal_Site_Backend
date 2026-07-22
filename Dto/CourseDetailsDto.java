package com.example.projem.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CourseDetailsDto {
    private Long cdetails_id;
    private String cdetails_title;
    private String cdetails_desc;
    private String cdetails_img;
    private String cdetails_createdate;
    private String cdetails_updatedate;
}

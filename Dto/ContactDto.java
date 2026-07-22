package com.example.projem.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ContactDto {
    private Long contact_id;
    private String contact_name;
    private String contact_mail;
    private String contact_msgtitle;
    private String contact_message;
    private String contact_createdate;
    private String contact_updatedate;

}

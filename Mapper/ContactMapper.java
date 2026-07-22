package com.example.projem.Mapper;


import com.example.projem.Dto.ContactDto;
import com.example.projem.Entity.Contact;


public interface ContactMapper {

    Contact toEntity(ContactDto contactDto);

    ContactDto toDTO(Contact contact);



}

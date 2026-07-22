package com.example.projem.Mapper;


import com.example.projem.Dto.ContactDto;
import com.example.projem.Entity.Contact;
import org.springframework.stereotype.Component;

@Component
public class ContactMapperImplements implements ContactMapper{

    @Override
     public ContactDto toDTO(Contact contact){
        ContactDto contactDto = new ContactDto();
        contactDto.setContact_mail(contact.getContact_mail());
        contactDto.setContact_message(contact.getContact_message());
        contactDto.setContact_name(contact.getContact_name());
        contactDto.setContact_msgtitle(contact.getContact_msgtitle());
        contactDto.setContact_createdate(contact.getContact_createdate());
        contactDto.setContact_updatedate(contact.getContact_updatedate());
        return contactDto;
    }

    @Override
    public Contact toEntity(ContactDto contactDto){
        Contact contact = new Contact();
        contact.setContact_mail(contactDto.getContact_mail());
        contact.setContact_message(contactDto.getContact_message());
        contact.setContact_name(contactDto.getContact_name());
        contact.setContact_msgtitle(contactDto.getContact_msgtitle());
        contact.setContact_createdate(contactDto.getContact_createdate());
        contact.setContact_updatedate(contactDto.getContact_updatedate());
        return contact;

    }



}

package com.example.projem.Service;

import com.example.projem.Dto.ContactDto;
import com.example.projem.Entity.Contact;

import java.util.List;

public interface ContactService {
    Contact saveContact(ContactDto contactDto);

    ContactDto getContactById(Long id);

    void deleteContactById(Long id);

    List<Contact> findAllContact();

}

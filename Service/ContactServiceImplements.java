package com.example.projem.Service;


import com.example.projem.Dto.ContactDto;
import com.example.projem.Entity.Contact;
import com.example.projem.Mapper.ContactMapper;
import com.example.projem.Repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImplements implements ContactService{

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    public ContactServiceImplements(final ContactRepository contactRepository, final ContactMapper contactMapper){
        this.contactRepository=contactRepository;
        this.contactMapper=contactMapper;
    }


    @Override
    public Contact saveContact(ContactDto contactDto){
        return contactRepository.save(contactMapper.toEntity(contactDto));

    }


    @Override
    public ContactDto getContactById(Long id){
        return contactMapper.toDTO(contactRepository.findById(id).get());
    }

    @Override
    public void deleteContactById(Long id){
        contactRepository.deleteById(id);
    }

    @Override
    public List<Contact> findAllContact(){
        List<Contact> contactList = contactRepository.findAll();
        return contactList;
    }




}

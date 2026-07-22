package com.example.projem.Controller;


import com.example.projem.Dto.ContactDto;
import com.example.projem.Entity.Contact;
import com.example.projem.Service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ContactController {


    private final ContactService contactService;

    public ContactController(ContactService contactService){
        this.contactService=contactService;
    }

    @PostMapping("/savecontact")
    @CrossOrigin(origins = "http://localhost:3000")
    public Contact saveContact (@RequestBody ContactDto contactDto){
        return contactService.saveContact(contactDto);
    }


    @GetMapping("/getcontactbyid/{id}")
    public ContactDto getContactById(@PathVariable(value = "id")Long id){
        return contactService.getContactById(id);
    }

    @GetMapping("/getallcontact")
    public List<Contact> getAllContact(){
        return contactService.findAllContact();
    }

    @PutMapping("/updatecontact/{id}")
    public Contact updateContact(@PathVariable Long id,@RequestBody ContactDto contactDto){
        return contactService.saveContact(contactDto);
    }

    @DeleteMapping("/deletecontact/{id}")
    public void deleteContactById(@PathVariable Long id){
        contactService.deleteContactById(id);

    }

}

package com.ns.nslookup.controller;

import com.ns.nslookup.services.ContactService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    ContactService contactService = new ContactService();
    @RequestMapping("/")
    public String Greating(){
        return "Hello World";
    }

    @RequestMapping("/contact")
    public String contactPage(){
        return "well come to contact page";
    }

    @RequestMapping("/contact/{id}")
    public String contactById(){
        int id = 0;
        return contactService.getCustomer(id);
    }
}

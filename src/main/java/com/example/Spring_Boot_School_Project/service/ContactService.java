package com.example.Spring_Boot_School_Project.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.Spring_Boot_School_Project.model.Contact;

@Service
public class ContactService {
    private static Logger log = LoggerFactory.getLogger(ContactService.class);

    public boolean saveContactMessage(Contact contact) {
        boolean isSaved = true;
        log.info("Contact message saved successfully");
        log.info(contact.toString());
        return isSaved;

    }
}

package com.example.Spring_Boot_School_Project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Spring_Boot_School_Project.model.Contact;
import com.example.Spring_Boot_School_Project.service.ContactService;

@Controller
public class ContactController {

    Logger log = LoggerFactory.getLogger(ContactController.class.getName());

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String displayContactPage(Contact contact) {
        return "contact";
    }

    @PostMapping("/saveMsg")
    public String saveMessage(Contact contact) {
        contactService.saveContactMessage(contact);
        return "redirect:/contact";
    }


    /*
     * @PostMapping("/saveMsg")
     * public String saveMessage(@RequestParam("name") String name,
     * 
     * @RequestParam("email") String email,
     * 
     * @RequestParam("message") String message,
     * 
     * @RequestParam String mobileNum, @RequestParam String subject) {
     * 
     * log.info("Name: " + name);
     * log.info("Email: " + email);
     * log.info("Message: " + message);
     * log.info("Mobile Number: " + mobileNum);
     * log.info("Subject: " + subject);
     * 
     * return "redirect:/contact";
     * }
     */

}

package com.example.Spring_Boot_School_Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    @GetMapping("/contact")
    public String displayContactPage() {
        return "contact";
    }
}

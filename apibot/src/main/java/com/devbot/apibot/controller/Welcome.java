package com.devbot.apibot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class Welcome {
    @RequestMapping("/")
    public String apibot () {
        return "Bem-vindo ao API Bot!";
    }

    
}

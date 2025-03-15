package com.creat.projeto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class Welcome {
            
        @GetMapping
        public String welcome() {
            return "Página Inicial";
        }
    
        @GetMapping("/lanchonete")
        public String hello() {
            return "Bem-vindo a Lanchonete";
        }
    
}

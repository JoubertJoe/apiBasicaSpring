package com.example.meu_primeiro_springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class HelloController {
    

    @GetMapping("/hello")
    public String hello() {
        return "Olá Mundo!!";
    }
    
}

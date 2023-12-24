package com.example.petrestapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class FisrtRESTController {
    @ResponseBody
    @GetMapping("/seyHello")
    public String sayHello() {
        return "Hello world!";
    }
}

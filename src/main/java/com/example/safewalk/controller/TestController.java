package com.example.safewalk.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "SafeWalk Backend is Running Successfully!";
    }
}


package com.example.currenttime_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HealthCheckController {
/*
    @GetMapping("/currentTime")
    public String healCheck() {
        return "App works!";
    }

 */
    @GetMapping("/currentTime")
    public String currentTime() {
        return "Current time: " + LocalDateTime.now();
    }

}

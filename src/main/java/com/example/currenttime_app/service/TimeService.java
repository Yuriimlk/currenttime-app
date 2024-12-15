package com.example.currenttime_app.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeService {

    public String currentTime() {
        return "Current time: " + LocalDateTime.now();
    }

}

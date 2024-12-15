package com.example.currenttime_app.controller;

import com.example.currenttime_app.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/currentTime")
    public String currentTime() {
        return timeService.currentTime();
    }

}

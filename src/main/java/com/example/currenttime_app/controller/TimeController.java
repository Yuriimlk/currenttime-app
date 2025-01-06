package com.example.currenttime_app.controller;

import com.example.currenttime_app.Config.ApiCaller;
import com.example.currenttime_app.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TimeController {

    private final TimeService timeService;

    @Autowired
    private ApiCaller apiCaller;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/currentTime")
    public String currentTime() {
        return timeService.currentTime();
    }

    @GetMapping("/availableTimeZones")
    public String[] availableTimeZones() {
        return apiCaller.getTimeZone();
    }

    @GetMapping("/coordinate")
    public String coordinate() {
        return apiCaller.getCoordinate();
    }

}

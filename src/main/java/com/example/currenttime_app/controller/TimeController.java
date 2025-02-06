package com.example.currenttime_app.controller;

import com.example.currenttime_app.Config.ApiCaller;
import com.example.currenttime_app.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService, ApiCaller apiCaller) {
        this.timeService = timeService;
    }

    @GetMapping("/currentTime")
    public String currentTime() {
        return timeService.currentTime();
    }

    @GetMapping("/availableTimeZones")
    public String[] availableTimeZones() {
        return timeService.availableTimeZones();
    }

    @GetMapping("/coordinate")
    public String coordinate(@RequestParam String latitude, @RequestParam String longtitude) {
        return timeService.coordinate(latitude, longtitude);
    }

}

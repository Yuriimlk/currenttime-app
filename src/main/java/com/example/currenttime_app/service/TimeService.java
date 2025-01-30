package com.example.currenttime_app.service;

import com.example.currenttime_app.Config.ApiCaller;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeService {

    private final ApiCaller apiCaller;

    public TimeService(ApiCaller apiCaller) {
        this.apiCaller = apiCaller;
    }

    public String currentTime() {
        return "Current time: " + LocalDateTime.now();
    }

    public String[] availableTimeZones() {
        return apiCaller.getTimeZone();
    }

    public String coordinate(String latitude, String longtitude) {
        return apiCaller.getCoordinate(latitude, longtitude);
    }

}

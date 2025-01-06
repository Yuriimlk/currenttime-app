package com.example.currenttime_app.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiCaller {

    private final RestTemplate restTemplate;

    public ApiCaller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String[] getTimeZone() {
        String apiUrl = "https://timeapi.io/api/timezone/availabletimezones";
        ResponseEntity<String[]> response = restTemplate.getForEntity(apiUrl, String[].class);

        return response.getBody();
    }

    public String getCoordinate() {
        String apiUrl = "https://timeapi.io/api/timezone/coordinate?latitude=38.9&longitude=-77.03";
        ResponseEntity<String> response = (ResponseEntity<String>) restTemplate.getForEntity(apiUrl, String.class);

        return response.getBody();
    }

}

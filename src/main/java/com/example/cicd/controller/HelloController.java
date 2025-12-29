package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "Okey");
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello CI/CD with Spring Boot 🚀");
    }
}

package com.myProject1.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheck {
    @GetMapping("/health-Check")
    String healthCheck(){
    return "Hello";
    }
}

package com.aims.quality.global;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class HealthCheckController {
    @GetMapping("/api/quality/health")
    public String healthcheck() {
        return "ok";
    }
}

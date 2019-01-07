package com.alexkoveckiy.strategy.server.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by Oleksii_Kovetskyi on 1/7/2019.
 */
@RestController
public class HealthController {

    @GetMapping("health")
    public LocalDateTime health() {
        return LocalDateTime.now();
    }
}

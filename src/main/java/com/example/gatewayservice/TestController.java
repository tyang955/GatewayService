package com.example.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tianhao Yang
 * @create 2023 12 16 5:50 PM
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Gateway is up and running!";
    }
}
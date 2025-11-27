package com.HKT.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // A controller handle HTTP request and return JSON
public class HelloWorldController {

    @GetMapping(path = "/hello") // Request Get into the helloWorld method
    public String helloWorld() {
        return "Hello HKT";
    }
}

package com.demo.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DemoController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }
}

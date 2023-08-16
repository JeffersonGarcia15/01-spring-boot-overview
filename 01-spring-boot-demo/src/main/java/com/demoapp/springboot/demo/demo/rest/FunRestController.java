package com.demoapp.springboot.demo.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose a "/" endpoint that returns "Hello, World!"

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello, World!</h1>";
    }
}

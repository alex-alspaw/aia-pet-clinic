package com.alexalspaw.aiapetclinic.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @PostMapping
    public String helloPost() {
        return "Posted";
    }
}

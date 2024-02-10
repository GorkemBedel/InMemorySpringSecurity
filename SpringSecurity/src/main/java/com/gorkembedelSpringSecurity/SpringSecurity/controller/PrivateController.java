package com.gorkembedelSpringSecurity.SpringSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String helloWorldPrivate(){
        return "Hello world from Private Controller";
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String helloWorldUser(){
        return "Private User controller";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String helloWorldAdmin(){
        return "Private admin controller.";
    }

}

package com.example.securityhomepage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

@GetMapping(path = {"/", "/home"})
    public String getHome() {
    return "/public/HomePage";
}

    @GetMapping("/welcome")
    public String getWelcome() {
        return "/private/WelcomePage";
    }


}

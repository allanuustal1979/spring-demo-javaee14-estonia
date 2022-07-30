package com.sda.javaee14.springdemojavaee14.controller.web;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

    // / or home
    @GetMapping({"/","/home"})
    public String homePage(){
        return "index";
    }
}

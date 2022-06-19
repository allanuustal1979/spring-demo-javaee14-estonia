package com.sda.javaee14.springdemojavaee14.controller;

import com.sda.javaee14.springdemojavaee14.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// @RestController creates new Spring bean based on the class
// bean = managed object (object created by Spring for us)
@RestController
public class MyFirstRestController {

    private static final Logger log = LoggerFactory.getLogger(MyFirstRestController.class);

    private final GreetingService greetingService;

    // dependency injection = providing required collaborators/dependencies by Spring
    public MyFirstRestController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // GetMapping means
    // - code of the method will be run when we hit endpoint
    // - we use exact HTTP method
    @GetMapping("/say-hello")
    public  String hello(){

        log.info("hello method eas called.");
        return "Welcome to Spring class!!!";
    }

    // example query link from google
    // https://www.google.com/search?q=Estonia
    // server: https://www.google.com/
    // /search: application (endpoint) on the server
    // ? : query separator
    // q=Estonia, q: parameter firstname, Estonia is value for q parameter
    // /greeting?firstname=Allan&surname=Uustal
    // & is used for another parameter is coming
    @GetMapping("/greeting")
    public String greetUser(@RequestParam(value = "name", defaultValue = "John")  String firstName,@RequestParam(value = "surname", defaultValue = "Doe") String surname){
        log.info("greetUser called with parameters: firstname:[{}], surname[{}]", firstName, surname); // String.format("firstname: %s, firstname")
        return greetingService.makeSomeGreetingToUser(firstName+ " " + surname);
    }
}


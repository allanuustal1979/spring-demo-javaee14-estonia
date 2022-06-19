package com.sda.javaee14.springdemojavaee14.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //prepares all required beans for testing purposes
public class GreetingServiceTest {

    @Autowired //request to Spring for providing the bean
    //should be used only with tests, because it reveals the insides to outside world!!!!
    private GreetingService greetingService;

    @Test
    public void injectionTest(){

        Assertions.assertNotNull(greetingService,"Greeting service should not be null");

    }
}

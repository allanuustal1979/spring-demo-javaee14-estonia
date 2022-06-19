package com.sda.javaee14.springdemojavaee14.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j // provide log field for us the same as:
// private static final Logger log = LoggerFactory.getLogger(GreetingService.class);

public class GreetingService {
    public String makeSomeGreetingToUser(String name){
        String result = "Welcome to Spring class: " + name;

        log.info(result);
        return result;
    }
}

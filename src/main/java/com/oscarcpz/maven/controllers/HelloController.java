package com.oscarcpz.maven.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    public String ping(HttpServletRequest request) {
        logger.info("Hello controller");
        return "Greetings from Spring Boot!";
    }

}

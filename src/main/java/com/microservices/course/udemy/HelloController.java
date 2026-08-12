package com.microservices.course.udemy;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private final MessageSource messageSource;

    public HelloController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String getAllUsers() {
        return "Hello World";
    }

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping(value = "/hello-world-internationalized")
    public String helloWorldInternationalized() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message", null,"Default message", locale);
    }
}


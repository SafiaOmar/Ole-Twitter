package com.tts.Twitter.controller;


import com.tts.Twitter.model.Greeting;
import com.tts.Twitter.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//I want to create a controller that will
//define a restful endpoint for some sort of message
@RestController
public class HelloController {

    GreetingService greetingService;

    public HelloController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    //we are going to implement a simple GET
    @GetMapping("/hello")
    public Greeting getHello() {
        return greetingService.getGreeting();
    }
}
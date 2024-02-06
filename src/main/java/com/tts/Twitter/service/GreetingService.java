package com.tts.Twitter.service;

import com.tts.Twitter.model.Greeting;

public interface GreetingService {

    //this is the contract that anyone who implements GreetingService must fulfill
    Greeting getGreeting();

}
package com.tts.Twitter.service;

import com.tts.Twitter.model.Greeting;
import com.tts.Twitter.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    private GreetingRepository greetingRepository;

    public GreetingServiceImpl(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting getGreeting() {
        Greeting greeting = new Greeting("Hidey ho neighborino!");
        return greetingRepository.save(greeting);
    }
}
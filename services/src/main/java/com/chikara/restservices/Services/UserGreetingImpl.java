package com.chikara.restservices.Services;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserGreetingImpl implements UserGreeting{

    public String userGreeting(Optional<String> name) {
        String responseStr = "Hello Guest!";
        if(name.isPresent()) {
            responseStr = String.format("Hello " + name.get());
        }
        return responseStr;
    }
}

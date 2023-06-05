package com.chikara.restservices.controller;

import com.chikara.restservices.Services.UserGreeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserGreetingController {
    private final UserGreeting userGreeting;

    public UserGreetingController(UserGreeting userGreeting) {
        this.userGreeting = userGreeting;
    }

    @GetMapping("/greeting")
    public String userGreeting(@RequestParam(value = "name") Optional<String> name) {
        return userGreeting.userGreeting(name);
    }
}

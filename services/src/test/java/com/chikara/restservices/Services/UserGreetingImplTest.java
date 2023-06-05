package com.chikara.restservices.Services;

import com.chikara.restservices.controller.UserGreetingController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

class UserGreetingImplTest {

    private UserGreeting userGreeting;

    @BeforeEach
    void setUp() {
        userGreeting = spy(UserGreetingImpl.class);
    }

    @DisplayName("Should display the correct greeting")
    @ParameterizedTest
    @CsvSource({
            "'', 'Hello'",
            "null, 'Hello null'",
            "Chikara, 'Hello Chikara'"
    })
    public void testUserGreeting(String input, String output) {
        assertEquals(userGreeting.userGreeting(Optional.of(input)).trim(), output.trim());
    }

    @DisplayName("Should return hello guest for /greeting call")
    public void testUserGreetingWithOptionalEmpty() {
        assertEquals(userGreeting.userGreeting(Optional.empty()), "Hello Guest!");
    }
}
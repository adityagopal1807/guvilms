package com.yourproject.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

    @Test
    public void testUserValidation() {
        String username = "TestUser";
        boolean isValid = username.matches("[a-zA-Z0-9]+");
        assertEquals(true, isValid, "Username should only contain alphanumeric characters.");
    }
}

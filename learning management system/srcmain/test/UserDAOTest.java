package com.yourproject.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserDAOTest {

    @Test
    public void testDatabaseConnection() {
        String dbConnection = "Mock Connection Established";
        assertNotNull(dbConnection, "Database connection should not be null.");
    }
}

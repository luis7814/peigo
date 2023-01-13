package com.peigo.account.security;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthCredentialsTest {
    AuthCredentials authCredentials = new AuthCredentials();

    @Test
    void testSetName() {
        authCredentials.setName("name");
    }

    @Test
    void testSetPassword() {
        authCredentials.setPassword("password");
    }

    @Test
    void testEquals() {
        boolean result = authCredentials.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = authCredentials.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = authCredentials.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = authCredentials.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}


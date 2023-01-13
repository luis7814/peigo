package com.peigo.account.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTest {
    User user = new User();

    @Test
    void testSetUserId() {
        user.setUserId("userId");
    }

    @Test
    void testSetName() {
        user.setName("name");
    }

    @Test
    void testSetPassword() {
        user.setPassword("password");
    }

    @Test
    void testSetUserTypeId() {
        user.setUserTypeId("userTypeId");
    }

    @Test
    void testEquals() {
        boolean result = user.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = user.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = user.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = user.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}


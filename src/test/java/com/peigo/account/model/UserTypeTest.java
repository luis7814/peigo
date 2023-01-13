package com.peigo.account.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserTypeTest {
    UserType userType = new UserType();

    @Test
    void testSetUserTypeId() {
        userType.setUserTypeId("userTypeId");
    }

    @Test
    void testSetName() {
        userType.setName("name");
    }

    @Test
    void testSetDescription() {
        userType.setDescription("description");
    }

    @Test
    void testEquals() {
        boolean result = userType.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = userType.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = userType.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = userType.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}


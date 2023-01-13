package com.peigo.account.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AccountTest {
    Account account = new Account();

    @Test
    void testSetAccountId() {
        account.setAccountId("accountId");
    }

    @Test
    void testSetAccountType() {
        account.setAccountType("accountType");
    }

    @Test
    void testSetAmount() {
        account.setAmount(Double.valueOf(0));
    }

    @Test
    void testSetUserId() {
        account.setUserId("userId");
    }

    @Test
    void testEquals() {
        boolean result = account.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = account.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = account.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = account.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}


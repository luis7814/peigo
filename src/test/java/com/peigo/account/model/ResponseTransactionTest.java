package com.peigo.account.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ResponseTransactionTest {
    ResponseTransaction responseTransaction = new ResponseTransaction();

    @Test
    void testSetTransactionId() {
        responseTransaction.setTransactionId("transactionId");
    }

    @Test
    void testSetOriginAccount() {
        responseTransaction.setOriginAccount("originAccount");
    }

    @Test
    void testSetAmountOriginAccount() {
        responseTransaction.setAmountOriginAccount(Double.valueOf(0));
    }

    @Test
    void testSetDestinationAccount() {
        responseTransaction.setDestinationAccount("destinationAccount");
    }

    @Test
    void testSetAmountDestinationAccount() {
        responseTransaction.setAmountDestinationAccount(Double.valueOf(0));
    }

    @Test
    void testSetTransactionDate() {
        responseTransaction.setTransactionDate("transactionDate");
    }

    @Test
    void testSetUserid() {
        responseTransaction.setUserid("userid");
    }

    @Test
    void testEquals() {
        boolean result = responseTransaction.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = responseTransaction.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = responseTransaction.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = responseTransaction.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}


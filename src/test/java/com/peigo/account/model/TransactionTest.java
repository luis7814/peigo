package com.peigo.account.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransactionTest {
    Transaction transaction = new Transaction();

    @Test
    void testSetTransactionId() {
        transaction.setTransactionId("transactionId");
    }

    @Test
    void testSetOriginAccount() {
        transaction.setOriginAccount("originAccount");
    }

    @Test
    void testSetDestinationAccount() {
        transaction.setDestinationAccount("destinationAccount");
    }

    @Test
    void testSetAmountTransaction() {
        transaction.setAmountTransaction(Double.valueOf(0));
    }

    @Test
    void testSetTransactionDate() {
        transaction.setTransactionDate("transactionDate");
    }

    @Test
    void testSetUserid() {
        transaction.setUserid("userid");
    }

    @Test
    void testEquals() {
        boolean result = transaction.equals("o");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testCanEqual() {
        boolean result = transaction.canEqual("other");
        Assertions.assertEquals(true, result);
    }

    @Test
    void testHashCode() {
        int result = transaction.hashCode();
        Assertions.assertEquals(0, result);
    }

    @Test
    void testToString() {
        String result = transaction.toString();
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}


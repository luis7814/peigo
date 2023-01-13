package com.peigo.account.controller;

import com.peigo.account.model.ResponseTransaction;
import com.peigo.account.model.Transaction;
import com.peigo.account.service.TransactionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class TransactionControllerTest {
    @Mock
    TransactionService transactionService;
    @InjectMocks
    TransactionController transactionController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        when(transactionService.save(any())).thenReturn(new ResponseTransaction());

        ResponseTransaction result = transactionController.save(new Transaction());
        Assertions.assertEquals(new ResponseTransaction(), result);
    }
}


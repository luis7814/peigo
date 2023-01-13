package com.peigo.account.service;

import com.peigo.account.model.Account;
import com.peigo.account.model.ResponseTransaction;
import com.peigo.account.model.Transaction;
import com.peigo.account.repository.TransactionRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class TransactionServiceTest {
    @Mock
    AccountService accountService;
    @Mock
    TransactionRepository transactionRepository;
    @InjectMocks
    TransactionService transactionService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        when(accountService.updateAccountAmount(anyString(), anyDouble(), anyInt())).thenReturn(new Account());

        ResponseTransaction result = transactionService.save(new Transaction());
        Assertions.assertEquals(new ResponseTransaction(), result);
    }
}


package com.peigo.account.controller;

import com.peigo.account.model.Account;
import com.peigo.account.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class AccountControllerTest {
    @Mock
    AccountService accountService;
    @InjectMocks
    AccountController accountController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        when(accountService.save(any())).thenReturn(new Account());

        Account result = accountController.save(new Account());
        Assertions.assertEquals(new Account(), result);
    }

    @Test
    void testUpdate() {
        when(accountService.update(any())).thenReturn(new Account());

        Account result = accountController.update(new Account());
        Assertions.assertEquals(new Account(), result);
    }

    @Test
    void testFindAll() {
        when(accountService.findAll()).thenReturn(List.of(new Account()));

        List<Account> result = accountController.findAll();
        Assertions.assertEquals(List.of(new Account()), result);
    }

    @Test
    void testSave2() {
        when(accountService.findById(anyString())).thenReturn(new Account());

        Account result = accountController.save("id");
        Assertions.assertEquals(new Account(), result);
    }
}


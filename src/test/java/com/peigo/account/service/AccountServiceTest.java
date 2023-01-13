package com.peigo.account.service;

import com.peigo.account.model.Account;
import com.peigo.account.repository.AccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.*;

class AccountServiceTest {
    @Mock
    AccountRepository accountRepository;
    @InjectMocks
    AccountService accountService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSave() {
        Account result = accountService.save(new Account());
        Assertions.assertEquals(new Account(), result);
    }

    @Test
    void testUpdate() {
        Account result = accountService.update(new Account());
        Assertions.assertEquals(new Account(), result);
    }

    @Test
    void testUpdateAccountAmount() {
        Account result = accountService.updateAccountAmount("accountId", Double.valueOf(0), Integer.valueOf(0));
        Assertions.assertEquals(new Account(), result);
    }

    @Test
    void testFindAll() {
        List<Account> result = accountService.findAll();
        Assertions.assertEquals(List.of(new Account()), result);
    }

    @Test
    void testFindById() {
        Account result = accountService.findById("id");
        Assertions.assertEquals(new Account(), result);
    }
}


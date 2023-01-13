package com.peigo.account.controller;

import com.peigo.account.model.Account;
import com.peigo.account.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/peigo/account")
    public Account save(@RequestBody Account account) {
        return accountService.save(account);
    }

    @PutMapping("/peigo/account")
    public Account update(@RequestBody Account account) {
        return accountService.update(account);
    }

    @GetMapping("/peigo/account")
    public List<Account> findAll() {
        return accountService.findAll();
    }

    @GetMapping(path = "/peigo/account", params = "id")
    public Account save(@RequestParam String id) {
        return accountService.findById(id);
    }

}

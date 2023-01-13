package com.peigo.account.service;

import com.peigo.account.model.Account;
import com.peigo.account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account save(Account account) {
        accountRepository.save(account);
        return account;
    }

    public Account update(Account account) {
        accountRepository.save(account);
        return account;
    }

    public Account updateAccountAmount(String accountId, Double pay, Integer number) {

        Account account = findById(accountId);

        if (account != null) {
            account.setAmount(account.getAmount() + (pay * number));
            accountRepository.save(account);
        }

        return account;
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account findById(String id) {
        Optional<Account> optionalAccount = accountRepository.findById(id);
        return optionalAccount.get();
    }

}

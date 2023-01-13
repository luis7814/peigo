package com.peigo.account.controller;

import com.peigo.account.model.ResponseTransaction;
import com.peigo.account.model.Transaction;
import com.peigo.account.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("peigo/transaction")
    public ResponseTransaction save(@RequestBody Transaction transaction) {

        return transactionService.save(transaction);
    }


}

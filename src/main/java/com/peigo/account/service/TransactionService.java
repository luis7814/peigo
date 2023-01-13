package com.peigo.account.service;

import com.peigo.account.model.Account;
import com.peigo.account.model.ResponseTransaction;
import com.peigo.account.model.Transaction;
import com.peigo.account.repository.TransactionRepository;
import com.peigo.account.utilities.Utilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransactionService {

    @Autowired
    private AccountService accountService;

    @Autowired
    private TransactionRepository transactionRepository;

    public ResponseTransaction save(Transaction transaction) {

        transaction.setTransactionId(Utilities.generatorId());

        transactionRepository.save(transaction);

        Account accountOrigin = accountService.updateAccountAmount(transaction.getOriginAccount(), transaction.getAmountTransaction(), -1);
        Account accountDestinity = accountService.updateAccountAmount(transaction.getDestinationAccount(), transaction.getAmountTransaction(), 1);

        ResponseTransaction responseTransaction = new ResponseTransaction();
        responseTransaction.setTransactionId(transaction.getTransactionId());
        responseTransaction.setOriginAccount(transaction.getOriginAccount());
        responseTransaction.setAmountOriginAccount(accountOrigin.getAmount());
        responseTransaction.setDestinationAccount(transaction.getDestinationAccount());
        responseTransaction.setAmountDestinationAccount(accountDestinity.getAmount());
        responseTransaction.setTransactionDate(new Date().toString());
        responseTransaction.setUserid(transaction.getUserid());

        return responseTransaction;

    }


}

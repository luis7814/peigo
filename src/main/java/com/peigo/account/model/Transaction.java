package com.peigo.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "origin_account")
    private String originAccount;

    @Column(name = "destination_account")
    private String destinationAccount;

    @Column(name = "amount_transaction")
    private Double amountTransaction;

    @Column(name = "transaction_date")
    private String transactionDate;

    @Column(name = "user_id")
    private String userid;
}

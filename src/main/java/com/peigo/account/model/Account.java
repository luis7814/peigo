package com.peigo.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @Column(name = "account_id")
    private String accountId;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "user_id")
    private String userId;

}

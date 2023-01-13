package com.peigo.account.model;

import lombok.Data;

@Data
public class ResponseTransaction {

    private String transactionId;
    private String originAccount;
    private Double amountOriginAccount;
    private String destinationAccount;
    private Double amountDestinationAccount;
    private String transactionDate;
    private String userid;

}

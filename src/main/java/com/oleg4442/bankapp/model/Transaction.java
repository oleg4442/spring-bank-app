package com.oleg4442.bankapp.model;

public class Transaction {

    private Long accountId;
    private Long clientId;
    private String transactionType;
    private Long amount;

    public Transaction(Long accountId, Long clientId, String transactionType, Long amount) {
        this.accountId = accountId;
        this.clientId = clientId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}

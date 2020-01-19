package com.oleg4442.bankapp.model;

public class Transaction {

    private Transaction transaction;
    private Client client;
    private String transactionType;
    private Long amount;

    public Transaction(Transaction transaction, Client client, String transactionType, Long amount) {
        this.transaction = transaction;
        this.client = client;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

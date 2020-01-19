package com.oleg4442.bankapp.model;

public class Account extends BaseEntity {

    private Client client;
    private Long balance;

    public Account(Client client, Long balance) {
        this.client = client;
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}

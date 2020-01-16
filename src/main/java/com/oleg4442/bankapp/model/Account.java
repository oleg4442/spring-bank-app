package com.oleg4442.bankapp.model;

public class Account extends BaseEntity {

    private Long clientId;
    private Long balance;

    public Account(Long clientId, Long balance) {
        this.clientId = clientId;
        this.balance = balance;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}

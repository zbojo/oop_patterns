package com.company.observerlecture;

public class BankAccount extends Subject {

    private double amount;

    public BankAccount() {
        this.amount = 0.0;
    }

    public double getAmount() {
        return this.amount;
    }

    public void credit(double value) {
        this.amount += value;
        notifyObservers();
    }

    public void debit(double value) {
        this.amount -= value;
        notifyObservers();
    }

}

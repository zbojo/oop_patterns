package com.company.observerlecture;

public class BankClient implements Observer {

    private BankAccount bankAccount;

    public BankClient(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.bankAccount.attach(this);
    }

    @Override
    public void update() {
        double amount = this.bankAccount.getAmount();
        System.out.println("Actual amount is " + amount);
    }

}

package com.company.observerlecture;

public class Main {

    public static void main(String[] args) {

        // Create subject (bank account)
        BankAccount bankAccount = new BankAccount();

        // Create observer (bank client assigned to the bank account)
        BankClient bankClient = new BankClient(bankAccount);

        // Do some credit and debit operations on bank account and bank client is updated automatically
        bankAccount.credit(100.0);
        bankAccount.debit(10.0);
        bankAccount.debit(30.0);
    }

}

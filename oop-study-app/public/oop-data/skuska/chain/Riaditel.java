package com.company.skuska.chain;

public class Riaditel implements Handler {

    private Handler successor;

    public Riaditel(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(double amount) {

        if (amount >= 5_000d && amount < 10_000d)
            System.out.println(String.format("Vydavok %.2f schvaluje Riaditel...", amount));
        else if (successor != null)
            successor.handleRequest(amount);
    }
}

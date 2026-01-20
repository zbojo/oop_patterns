package com.company.skuska.chain;

public class Veduci implements Handler {

    private Handler successor;

    public Veduci(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(double amount) {

        if (amount < 5_000d)
            System.out.println(String.format("Vydavok %.2f schvaluje Veduci...", amount));
        else if (successor != null)
            successor.handleRequest(amount);
    }
}

package com.company.skuska.chain;

public class Viceprezident implements Handler {

    private Handler successor;

    public Viceprezident(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handleRequest(double amount) {

        if (amount >= 10_000d && amount < 30_000d)
            System.out.println(String.format("Vydavok %.2f schvaluje Viceprezident...", amount));
        else if (successor != null)
            successor.handleRequest(amount);
    }
}

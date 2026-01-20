package com.company.skuska.chain;

public class Prezident implements Handler {

    @Override
    public void handleRequest(double amount) {
        if (amount >= 30_000d)
            System.out.println(String.format("Vydavok %.2f schvaluje Prezident...", amount));
    }
}

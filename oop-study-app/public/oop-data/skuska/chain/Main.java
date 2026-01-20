package com.company.skuska.chain;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Handler handler = new Veduci(new Riaditel(new Viceprezident(new Prezident())));

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            handler.handleRequest(random.nextInt(100_000));
        }
    }
}

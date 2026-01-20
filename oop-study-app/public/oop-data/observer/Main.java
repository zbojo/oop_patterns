package com.company.observer;

public class Main {

    public static void main(String[] args) {

        ServerWolrd serverWolrd = new ServerWolrd();

        Player jozko = new Player();
        Admin irenka = new Admin();


//        serverWolrd.addObserver(jozko);
//        serverWolrd.addObserver(irenka);


        serverWolrd.addObserver(what -> {
            if (what.equals("spadol strom")) {
                System.out.println("Aaaa!");
            }
        });

        serverWolrd.treeFell();
        serverWolrd.kingDied();


    }
}

package com.company.observer;

public class Player implements Observ {



    @Override
    public void react(String str) {
//        System.out.println("Player ok!");
        if (str.equals("spadol strom")) {
            System.out.println("super");
        } else if (str.equals("umrel kral")) {
            System.out.println("ups");
        }
    }
}

package com.company.observer;

public class Admin implements Observ {
    @Override
    public void react(String str) {
        System.out.println(str);
    }
}

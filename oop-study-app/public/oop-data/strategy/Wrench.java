package com.company.strategy;

public class Wrench implements Strategy {

    @Override
    public void execute() {
        System.out.println("Using wrench.");
    }

}

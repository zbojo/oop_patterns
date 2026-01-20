package com.company.strategy;

public class Screwdriver implements Strategy {

    @Override
    public void execute() {
        System.out.println("Using screwdriver.");
    }

}

package com.company.decorator;

public class Steak implements Order {

    private double price;

    public Steak(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void printOrder() {
        System.out.println("Steak: " + this.price);
    }
}

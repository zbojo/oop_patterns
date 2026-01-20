package com.company.decorator;

public class Chips extends SideDish {

    private double price;

    public Chips(Order order, double price) {
        super(order);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.price;
    }

    @Override
    public void printOrder() {
        super.printOrder();
        System.out.println("Chips: " + this.price);
    }
}

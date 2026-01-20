package com.company.decorator;

public class Salad extends SideDish {

    private double price;

    public Salad(Order order, double price) {
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
        System.out.println("Salad: " + this.price);
    }
}

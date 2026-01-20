package com.company.decorator;

public abstract class SideDish implements Order {

    private Order order;

    public SideDish(Order order) {
        this.order = order;
    }

    @Override
    public double getPrice() {
        return this.order.getPrice();
    }

    @Override
    public void printOrder() {
        this.order.printOrder();
    }
}

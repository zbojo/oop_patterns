package com.company.decorator;

public class Main {

    public static void main(String[] args) {

        // Make an order
        Order order = new Salad(new Chips(new Steak(20.0), 3.5), 5.0);

        // Print order and total price
        order.printOrder();
        System.out.println("Total price: " + order.getPrice());
    }
}

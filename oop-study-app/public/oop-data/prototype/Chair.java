package com.company.prototype;

public class Chair extends Product {

    private boolean hasWheels;

    public Chair(String name, boolean hasWheels) {
        super(name);
        this.hasWheels = hasWheels;
    }

    @Override
    public Product createClone() {
        return new Chair(getName(), this.hasWheels);
    }
}

package com.company.prototype;

public class Table extends Product {

    private boolean isRound;

    public Table(String name, boolean isRound) {
        super(name);
        this.isRound = isRound;
    }

    @Override
    public Product createClone() {
        return new Table(getName(), this.isRound);
    }
}

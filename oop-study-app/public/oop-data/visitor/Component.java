package com.company.visitor;

public abstract class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPrice();

    public abstract void accept(ComponentVisitor v);

}

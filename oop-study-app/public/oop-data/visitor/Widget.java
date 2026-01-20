package com.company.visitor;

public class Widget extends Component {

    private double price;

    public Widget(String name, double price) {
        super(name);
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void accept(ComponentVisitor v) {
        v.visit(this);
    }

}

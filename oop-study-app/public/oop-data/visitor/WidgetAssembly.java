package com.company.visitor;

import java.util.LinkedList;
import java.util.List;

public class WidgetAssembly extends Component {

    private List<Component> components;

    public WidgetAssembly(String name) {
        super(name);
        this.components = new LinkedList<>();
    }

    public void addComponent(Component c) {
        this.components.add(c);
    }

    public void removeComponent(Component c) {
        this.components.remove(c);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0.0;
        for (Component c : this.components)
            totalPrice += c.getPrice();
        return totalPrice;
    }

    @Override
    public void accept(ComponentVisitor v) {
        v.visit(this);
    }

}

package com.company.visitor;

public class Main {

    public static void main(String[] args) {

        // Create two Widgets
        Widget w1 = new Widget("MyWidget1", 10.00);
        Widget w2 = new Widget("MyWidget2", 20.00);

        // Create WidgetAssembly which contains two widgets
        WidgetAssembly wa = new WidgetAssembly("MyAssembly");
        wa.addComponent(w1);
        wa.addComponent(w2);

        // Use simple visitor
        SimpleVisitor sv = new SimpleVisitor();
        w1.accept(sv);
        w2.accept(sv);
        wa.accept(sv);

        // Use price visitor
        PriceVisitor pv = new PriceVisitor(25.00);
        w1.accept(pv);
        w2.accept(pv);
        wa.accept(pv);
    }
}

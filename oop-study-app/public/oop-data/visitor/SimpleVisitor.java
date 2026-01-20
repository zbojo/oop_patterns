package com.company.visitor;

public class SimpleVisitor implements ComponentVisitor {

    @Override
    public void visit(Widget w) {
        System.out.println("Visiting Widget " + w.getName());
    }

    @Override
    public void visit(WidgetAssembly wa) {
        System.out.println("Visiting WidgetAssembly " + wa.getName());
    }

}

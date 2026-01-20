package com.company.visitor;

public interface ComponentVisitor {

    void visit(Widget w);

    void visit(WidgetAssembly wa);

}

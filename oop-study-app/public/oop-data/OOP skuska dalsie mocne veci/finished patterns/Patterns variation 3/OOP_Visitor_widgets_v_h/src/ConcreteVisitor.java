/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class ConcreteVisitor implements Visitor{

    @Override
    public void visitConcreteWidget(ConcreteWidget widget) {
        System.out.println("navstevujem widget");
    }

    @Override
    public void visitConcreteWidgetAssembly(ConcreteWidgetAssembly widgetAssembly) {
        System.out.println("navstevujem widgetAssembly");
    }
    
}

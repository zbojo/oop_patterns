/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class ConcreteWidgetAssembly implements Widget{
    public ConcreteWidgetAssembly(){
        
    }

    @Override
    public void Accept(ConcreteVisitor v) {
        v.visitConcreteWidgetAssembly(this);
    }
    
}

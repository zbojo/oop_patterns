/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ESKOPC
 */
public class Engine implements CarElement{

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
    
}

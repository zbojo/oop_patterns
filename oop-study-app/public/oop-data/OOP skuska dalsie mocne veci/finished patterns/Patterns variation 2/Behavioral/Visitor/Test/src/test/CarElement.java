/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ESKOPC
 */
public interface CarElement {
    
    public void accept(CarElementVisitor visitor);
    
}

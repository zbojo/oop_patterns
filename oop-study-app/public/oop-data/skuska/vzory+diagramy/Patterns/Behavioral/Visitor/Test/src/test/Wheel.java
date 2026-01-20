/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ESKOPC
 */
public class Wheel implements CarElement{
    
    private String name;
    public Wheel(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
           
   
    
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
    
}

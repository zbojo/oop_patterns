/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Icecream;

/**
 *
 * @author ESKOPC
 */
public class HoneyDecorator extends IcecreamDecorator{
    
    public HoneyDecorator(Icecream icecream)
    {
        super(icecream);
    }
    
    @Override
    public String makeIcecream()
    {
        return icecream.makeIcecream() + addHoney();
    }
    
    public String addHoney()
    {
        return " + sladky medik";
    }
    
}

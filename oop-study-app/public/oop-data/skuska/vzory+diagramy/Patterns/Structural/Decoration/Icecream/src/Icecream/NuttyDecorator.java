/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Icecream;

/**
 *
 * @author ESKOPC
 */
public class NuttyDecorator extends IcecreamDecorator{
    
    
    public NuttyDecorator(Icecream icecream)
    {
        super(icecream);
    }
    
    @Override
    public String makeIcecream()
    {
        return icecream.makeIcecream() + addNuts();
    }
    
    public String addNuts()
    {
        return " + chrumkave oriesky";
    }
    
}

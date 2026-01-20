/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Icecream;

/**
 *
 * @author ESKOPC
 */
public abstract class IcecreamDecorator implements Icecream{
    
    Icecream icecream;
    
    public IcecreamDecorator(Icecream icecream)
    {
        this.icecream = icecream;
    }

    @Override
    public String makeIcecream() {
        return icecream.makeIcecream();
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author ESKOPC
 */
public abstract class CoffeeDecorator implements Coffee{
    
    protected  Coffee decoratedCoffee;
    
    
    public CoffeeDecorator(Coffee decoratedCoffee)
    {
        this.decoratedCoffee = decoratedCoffee;
    }
    
    @Override
    public String getIngredients()
    {
        return decoratedCoffee.getIngredients();
    }
    
    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost();
    }
    
}



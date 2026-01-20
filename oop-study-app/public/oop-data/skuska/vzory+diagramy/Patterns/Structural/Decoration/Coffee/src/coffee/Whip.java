/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author ESKOPC
 */
public class Whip extends CoffeeDecorator{
    
    public Whip(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
    }
    
    @Override
    public String getIngredients()
    {
        return decoratedCoffee.getIngredients() + ", " + "Whip";
    }
    
    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost() + 0.7;
    }
    
}

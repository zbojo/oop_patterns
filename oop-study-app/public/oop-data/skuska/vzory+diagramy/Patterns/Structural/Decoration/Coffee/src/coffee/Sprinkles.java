/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author ESKOPC
 */
public class Sprinkles extends CoffeeDecorator{
    
    public Sprinkles(Coffee decoratedCoffee)
    {
        super(decoratedCoffee);
    }
    
    @Override
    public String getIngredients()
    {
        return decoratedCoffee.getIngredients() + ", " + "Sprinkles";
    }
    
    @Override
    public double getCost()
    {
        return decoratedCoffee.getCost() + 1.5;
    }
    
}

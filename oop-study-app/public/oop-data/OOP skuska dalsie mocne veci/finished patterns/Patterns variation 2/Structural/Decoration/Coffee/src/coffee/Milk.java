/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author ESKOPC
 */
public class Milk extends CoffeeDecorator {

    public Milk(Coffee decoratedCoffee) {
        
        super(decoratedCoffee);
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients() + ", " + " Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

}

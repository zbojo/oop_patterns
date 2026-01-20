/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ESKOPC
 */
public class Waiter {
    
    
    private PizzaBuilder pizzabuilder;
    
    public void setPizzaBuilder(PizzaBuilder pb)
    {
        pizzabuilder = pb;
    }
    
    public Pizza getPizza()
    {
        return pizzabuilder.getPizza();
    }
    
    public void constructPizza()
    {
        pizzabuilder.createNewPizzaProduct();
        pizzabuilder.buildDaugh();
        pizzabuilder.buildSauce();
        pizzabuilder.buildTopping();
    }
    
}

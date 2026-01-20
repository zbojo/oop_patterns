/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ESKOPC
 */
public abstract class PizzaBuilder {
    
    Pizza pizza;
    
    
    public Pizza getPizza()
    {
        return pizza;
    }
    
    public void createNewPizzaProduct()
    {
        pizza = new Pizza();
    }
    
    public abstract void buildDaugh();
    public abstract void buildSauce();
    public abstract void buildTopping();
    
    
}

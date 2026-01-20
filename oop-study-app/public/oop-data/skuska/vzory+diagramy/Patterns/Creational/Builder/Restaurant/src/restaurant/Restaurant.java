/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ESKOPC
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaii = new HawaiiPizzaBuilder();
        
        waiter.setPizzaBuilder(hawaii);
        waiter.constructPizza();
        
        Pizza pizza = waiter.getPizza();
        
    }
}

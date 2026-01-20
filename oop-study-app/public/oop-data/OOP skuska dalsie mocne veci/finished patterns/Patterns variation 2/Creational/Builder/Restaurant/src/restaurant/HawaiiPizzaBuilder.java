/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ESKOPC
 */
public class HawaiiPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDaugh() {
        pizza.setDaugh("cross");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("chilli");
        
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("peanapple+ham");
    }
   
    
}

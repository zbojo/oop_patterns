/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

/**
 *
 * @author ESKOPC
 */
public class SpicePizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDaugh() {
        pizza.setDaugh("tvrde");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("extra chilli");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("red papper+salama+olivas");
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author ESKOPC
 */
public class SimpleCoffee implements Coffee{

    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
    
}

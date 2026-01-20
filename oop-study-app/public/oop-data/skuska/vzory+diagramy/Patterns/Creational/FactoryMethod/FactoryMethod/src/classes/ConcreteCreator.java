/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Creator;
import interfaces.Product;

/**
 *
 * @author ESKOPC
 */
public class ConcreteCreator implements Creator{
    
    private Product product;
    
    public ConcreteCreator(Product p)
    {
        product = p;
    }
    

    @Override
    public String getProduct() {
        return product.talk();
    }
    
}

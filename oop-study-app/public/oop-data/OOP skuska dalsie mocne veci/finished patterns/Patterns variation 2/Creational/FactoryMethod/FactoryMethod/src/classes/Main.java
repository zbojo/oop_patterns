/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.Product;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    public static void main(String[] argv)
    {
        
        ConcreteCreator cc = new ConcreteCreator(new ConcreteProduct());
        ConcreteCreator cc1 = new ConcreteCreator(new ConcreteProduct2());
        
        System.out.println(cc.getProduct());
         System.out.println(cc1.getProduct());
        
    }
    
}

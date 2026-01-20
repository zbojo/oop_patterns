/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoho;

import classes.ConcreteFactory1;
import classes.ConcreteFactory2;

/**
 *
 * @author spilinator
 */
public class Client {
    
    public static void main(String[] args) {
        
        ConcreteFactory1 cf1 = new ConcreteFactory1();
        cf1.CreateProductA();
        cf1.CreateProductB();
        
        ConcreteFactory2 cf2 = new ConcreteFactory2();
        cf2.CreateProductA();
        cf2.CreateProductB();
        
    }
}

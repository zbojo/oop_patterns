/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Abstract.AbstractFactory;
import Abstract.AbstraktProduktA;
import Abstract.AbstraktProduktB;

/**
 *
 * @author spilinator
 */
public class ConcreteFactory1 implements AbstractFactory {
      

    @Override
    public AbstraktProduktA CreateProductA() {
       ProduktA1 a1 = new ProduktA1();
       return a1;
    }

    @Override
    public AbstraktProduktB CreateProductB() {
        ProduktB1 b1 = new ProduktB1();
        return b1;
    }

    
}

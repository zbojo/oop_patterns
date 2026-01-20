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
public class ConcreteFactory2 implements AbstractFactory {
  
    @Override
    public AbstraktProduktA CreateProductA() {
         ProduktA2 a2 = new ProduktA2();
         return a2;
    }

    @Override
    public AbstraktProduktB CreateProductB() {
        ProduktB2 b2 = new ProduktB2();
        return b2;
    }
}

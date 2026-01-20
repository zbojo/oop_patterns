/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Abstract.AbstraktProduktB;

/**
 *
 * @author spilinator
 */
public final class ProduktB1 implements AbstraktProduktB {

    @Override
    public void rozpravaj() {
        System.out.println("Princezna bude len moja");
    }
    
    public ProduktB1(){
        this.rozpravaj();
    }
    
}

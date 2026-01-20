/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import Abstract.AbstraktProduktA;

/**
 *
 * @author spilinator
 */
public final class ProduktA1 implements AbstraktProduktA{

    @Override
    public void rozpravaj() {
        System.out.println("Cakam na svojho princa");
    }
    
    public ProduktA1(){
        this.rozpravaj();
    }
}

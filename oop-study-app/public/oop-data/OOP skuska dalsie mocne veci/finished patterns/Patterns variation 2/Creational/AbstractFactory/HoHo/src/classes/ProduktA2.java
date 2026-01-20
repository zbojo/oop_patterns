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
public final class ProduktA2 implements AbstraktProduktA {

    @Override
    public void rozpravaj() {
        System.out.println("Babicka , preco mas take velke oci ?");
    }
    
     public ProduktA2(){
        this.rozpravaj();
    }
}

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
public final class ProduktB2 implements AbstraktProduktB{
    
    @Override
    public void rozpravaj() {
        System.out.println("To aby som ta lepsie videla");
    }
    
    public ProduktB2(){
        this.rozpravaj();
    }
}

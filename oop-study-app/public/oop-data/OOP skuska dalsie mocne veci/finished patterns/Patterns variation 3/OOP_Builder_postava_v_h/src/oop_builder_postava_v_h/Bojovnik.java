/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_builder_postava_v_h;

/**
 *
 * @author viktorooo
 */
public class Bojovnik implements Builder{
    private Product product = new Product();
    
    public Bojovnik(){
        
    }

    @Override
    public void buildPart() {
        product.setOblecenie("kruzkova kosela");
        product.setSpravanie("bojuj");
        product.setZbran("mec");
       
    }
    
    public Product getResult(){
        return this.product;
    }
    
}

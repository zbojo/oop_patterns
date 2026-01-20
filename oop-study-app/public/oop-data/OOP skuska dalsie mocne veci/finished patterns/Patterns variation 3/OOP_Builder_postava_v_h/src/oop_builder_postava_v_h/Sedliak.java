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
public class Sedliak implements Builder {
    private Product product = new Product();
    
    public Sedliak(){
        
    }
    
    @Override
    public void buildPart() {
        product.setOblecenie("platena kosela");
        product.setSpravanie("utekaj");
        product.setZbran("motyka");
        
    }
    
    public Product getResult(){
        return this.product;
    }
    
    
    
}

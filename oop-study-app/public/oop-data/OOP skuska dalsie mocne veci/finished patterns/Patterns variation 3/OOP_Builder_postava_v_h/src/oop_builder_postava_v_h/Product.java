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
public class Product {
    private String oblecenie;
    private String zbran;
    private String spravanie;
    
    public Product(){
        
    }
    public String getInfo(){
        return oblecenie+" "+zbran+" "+spravanie;
    }
    
    public void setOblecenie(String oblecenie){
        this.oblecenie=oblecenie;
    }
    
    public void setZbran(String zbran){
        this.zbran=zbran;
    }
    
    public void setSpravanie(String spravanie){
        this.spravanie=spravanie;
    }
    
}

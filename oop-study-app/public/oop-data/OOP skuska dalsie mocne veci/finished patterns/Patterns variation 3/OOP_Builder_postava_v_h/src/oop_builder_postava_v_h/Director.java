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
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder=builder;
    }
    
    public void construct(){
        builder.buildPart();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_composite_name_v_h;

/**
 *
 * @author viktorooo
 */
public class Leaf implements Component{
    private String name;
    public Leaf(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int spocitaj() {
        
        return 1;
    }
    
    
    
    
}

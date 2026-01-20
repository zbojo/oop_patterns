/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_composite_name_v_h;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viktorooo
 */
public class Composite implements Component{
    private List<Component> composite = new ArrayList<>();
    private int pocetSuborov;
    private String name;
    
    public Composite(String name){
        this.name=name;                
    }
    
    public void vlozDoZlozky(Component c){
        composite.add(c);
    }
    
    public void vymazSubor(Component c){
        composite.remove(c);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int spocitaj() {
        pocetSuborov=composite.size();
        
        return pocetSuborov;
    }
}

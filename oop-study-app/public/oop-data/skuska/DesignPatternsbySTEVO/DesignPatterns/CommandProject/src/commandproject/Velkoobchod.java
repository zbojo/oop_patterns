/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandproject;

import java.util.ArrayList;

/**
 *
 * @author Stevo
 */
public class Velkoobchod {

    private ArrayList<Objednavka> objednavky;

    public Velkoobchod() {
        this.objednavky = new ArrayList<Objednavka>();
    }

    public void prijemObjednavky(Objednavka o) {
        this.objednavky.add(o);
    }
    
    public void vykonajTuNaRade(){
    this.objednavky.get(0).execute();
    this.objednavky.remove(this.objednavky.get(0));
    }
    
    public void vykonajVsetky(){
        int i;
    while(!objednavky.isEmpty()){
        vykonajTuNaRade();
    }
    }
    
}

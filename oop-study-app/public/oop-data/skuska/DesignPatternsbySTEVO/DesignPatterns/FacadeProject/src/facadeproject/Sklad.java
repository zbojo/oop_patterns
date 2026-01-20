/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadeproject;

/**
 *
 * @author Stevo
 */
public class Sklad {

    private int mnozstvo;

    public Sklad() {
        mnozstvo = 54;
    }

    public int getMnozstvo() {
        return mnozstvo;
    }

    public void setMnozstvo(int newmn) {
        mnozstvo = newmn;
    }
    
    public void odovzdajOvocie(){
        System.out.println("Odovzdavam ovocie...");
        mnozstvo--;
    }
    
    public void skladujOvocie(String ovoc){
        System.out.println("Uskladnim ti ovocie: "+ovoc+".");
        mnozstvo++;
    }
    
}

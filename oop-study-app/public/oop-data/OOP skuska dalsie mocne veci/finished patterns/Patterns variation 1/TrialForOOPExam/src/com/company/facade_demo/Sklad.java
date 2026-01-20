package com.company.facade_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
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

package com.company.facade_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class VelkoobchodFacade {
    private Obchod obchod;
    private Sklad sklad;

    public VelkoobchodFacade(){
        System.out.println("Vitajte v nasej firme...");
        obchod = new Obchod();
        sklad = new Sklad();
    }

    public int zakolkoKupimVsetkoVsklade(){
        obchod.pisSpracujObjednavku();
        return obchod.zistiCenu(sklad.getMnozstvo());
    }

    public void donesOvocie(){
        sklad.odovzdajOvocie();
        System.out.println("Nech sa paci...");
    }

    public void ulozOvocie(String ake){
        sklad.skladujOvocie(ake);
    }

    public void kolkoJeOvocia(){
        System.out.println("Ovocia je " + sklad.getMnozstvo());
    }
}

package com.company.facade_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Obchod {
    public int zistiCenu(int pocetOvocia){
        return pocetOvocia*5;
    }

    public void pisSpracujObjednavku(){
        System.out.println("Spracuvam objednavku");
    }
}

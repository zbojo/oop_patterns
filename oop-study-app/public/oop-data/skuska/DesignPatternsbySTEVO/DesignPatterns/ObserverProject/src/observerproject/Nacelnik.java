/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerproject;

import java.util.ArrayList;

/**
 *
 * @author Stevo
 */
public class Nacelnik implements Vodca {

    private ArrayList<Observer> followers;
    private int damaged;

    public Nacelnik() {
        followers = new ArrayList<Observer>();
        damaged=0;
    }

    @Override
    public void damaged(int skody) {
        damaged+=skody;
        notify("damaged");
    }

    @Override
    public void zvolajPoradu() {
        System.out.println("Nacelnik zvolava poradu...");
        notify("porada");
    }

    @Override
    public int getDamaged() {
        return damaged;
    }

    @Override
    public void pridajDoKmena(Observer co) {
        followers.add(co);
    }

    @Override
    public void vykopniZKmena(Observer co) {
        followers.remove(co);
    }

    @Override
    public void notify(String code) {
        for(Observer konkretnyTipek : followers){
        konkretnyTipek.update(code);
        }
    }
    

}

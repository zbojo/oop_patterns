/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeproject;

/**
 *
 * @author Stevo
 */
//COMPOSITE
public class Velkoobchod extends Dodavatel {

    private Dodavatel lavySyn;
    private Dodavatel pravySyn;

    @Override
    public int ZistiTrzby() {
        int t1 = 0;
        int t2 = 0;
        if (lavySyn != null) {
            t1 = lavySyn.ZistiTrzby();
        }
        if (pravySyn != null) {
            t2 = pravySyn.ZistiTrzby();
        }
        return t1 + t2;
    }

    @Override
    public void ZakazCinnost() {
        if (lavySyn != null) {
            lavySyn.ZakazCinnost();
        }
        if (pravySyn != null) {
            pravySyn.ZakazCinnost();
        }
    }

    //addChild
    public void pridajSyna(boolean lr, Dodavatel syn) {
        if (lr) {
            pravySyn = syn;
        } else {
            lavySyn = syn;
        }
    }
    
    //removeChild
    public void zmazSyna(boolean lr){
     if (lr) {
            pravySyn = null;
        } else {
            lavySyn = null;
        }
    }

}

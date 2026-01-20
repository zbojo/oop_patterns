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
//COMPONENT
public class Dodavatel {

    protected int trzby;
    protected boolean zakaz;

    public int ZistiTrzby() {
        System.out.println("Odtial mate trzbu: "+trzby);
        return trzby;
    }

    public void ZakazCinnost() {
        zakaz = true;
    }
}

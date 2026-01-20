/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Stevo
 */
public class Velkoobchod {

    private Sluzba typSluzby;

    public void nastavStraegiu(Sluzba typStrategie) {
        typSluzby = typStrategie;
    }
    
    public void vybavTo(){
    typSluzby.vykonaj();
    }
}

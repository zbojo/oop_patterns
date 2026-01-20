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
public class StandardnaSluzba implements Sluzba{

    @Override
    public void vykonaj() {
        System.out.println("Tato sluzba je standardna taze troska potrva kym to urobime...");
        System.out.println("Az teraz je to hotove...");
    }
            

}

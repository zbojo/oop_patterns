/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorproject;

/**
 *
 * @author Stevo
 */
public class Pestovatel implements Dodavatel{

    @Override
    public void DodajSuroviny() {
        System.out.println("Posielam suroviny...");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethodproject;

/**
 *
 * @author Stevo
 */
public class VelkoobchodSovocim extends Velkoobchod {
    
    public Ovocie vytvorOvocie(String meno) {
        switch(meno){
            case "Pomaranc": return new Pomaranc();
            case "Jablko": return new Jablko();
        }
        return null;
    }
    
}

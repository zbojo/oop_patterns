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
public class FactoryMethodProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //toto je maloobchod
        Velkoobchod FRUIT= new VelkoobchodSovocim();
        FRUIT.vytvorOvocie("Jablko").jem();
        FRUIT.vytvorOvocie("Pomaranc").jem();
    }
    
}

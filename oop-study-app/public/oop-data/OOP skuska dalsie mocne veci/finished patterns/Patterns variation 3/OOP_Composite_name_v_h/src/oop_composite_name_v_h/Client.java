/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_composite_name_v_h;

/**
 *
 * @author viktorooo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Subor 1");
        Leaf leaf2 = new Leaf("Subor 2");
        Leaf leaf3 = new Leaf("Subor 3");
        Leaf leaf4 = new Leaf("Subor 4");
        Composite composite = new Composite("zlozka 1");
        composite.vlozDoZlozky(leaf1);
        composite.vlozDoZlozky(leaf2);
        composite.vlozDoZlozky(leaf3);
        
        System.out.println("meno: "+leaf4.getName()+"\npocet suborov: " +leaf4.spocitaj());
        System.out.println("meno: "+composite.getName()+"\npocet suborov: " +composite.spocitaj());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_decorator_postava_v_h;

/**
 *
 * @author viktorooo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Component postava = new Puska(new Mobil(new Peniaze(new Postava())));
        
        System.out.println("DEKOROVANA POSTAVA: "+postava.vypisCinnost());
    }
    
}

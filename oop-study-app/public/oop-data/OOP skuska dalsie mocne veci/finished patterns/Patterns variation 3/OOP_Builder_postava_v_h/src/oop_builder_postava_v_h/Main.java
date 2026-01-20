/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_builder_postava_v_h;

/**
 *
 * @author viktorooo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedliak builderSedliak = new Sedliak();
        Bojovnik builderBojovnik = new Bojovnik();
        Director director = new Director(builderSedliak);
        
        director.construct();
        
        Product product= builderSedliak.getResult();
        System.out.println(product.getInfo());
        
    }
    
}

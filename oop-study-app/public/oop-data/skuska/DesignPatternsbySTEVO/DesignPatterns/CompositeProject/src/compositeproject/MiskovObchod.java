/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeproject;

import java.util.Random;

/**
 *
 * @author Stevo
 */

//LEAF
public class MiskovObchod extends Dodavatel {
Random generator = new Random();
    public MiskovObchod() {
        trzby = generator.nextInt(100)+1;
        zakaz=false;
    }
    
    
}

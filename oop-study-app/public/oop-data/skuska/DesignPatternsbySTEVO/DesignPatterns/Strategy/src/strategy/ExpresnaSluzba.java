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
public class ExpresnaSluzba implements Sluzba{

    @Override
    public void vykonaj() {
        System.out.println("Expresna sluzba ihned vykonala, co trebalo...");
    }
    
}

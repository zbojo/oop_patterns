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
public class Laboratorium extends FilterSkladu {
    
    public Laboratorium(Dodavatel newDodavatel){
        pestovatel=newDodavatel;    
    }
    
    public void MojaSluzba(){
        System.out.println("Ta ja ti este suroviny chemicky upravim...");
    }
    
}

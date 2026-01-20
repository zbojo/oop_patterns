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
public class Umyvaren extends FilterSkladu{
    
    public Umyvaren(Pestovatel newPestovatel){
    pestovatel=newPestovatel;
    }
    
    public void MojaSluzba(){
        System.out.println("Ta ja ti poumyvam ten tovar...");
    }

}

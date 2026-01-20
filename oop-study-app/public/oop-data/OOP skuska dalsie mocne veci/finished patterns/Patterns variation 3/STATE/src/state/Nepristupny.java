/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class Nepristupny implements State {
    
    @Override
    public void handle() {
        
        System.out.println("Panel neni pristupny daco je zle...");
        
    }
}

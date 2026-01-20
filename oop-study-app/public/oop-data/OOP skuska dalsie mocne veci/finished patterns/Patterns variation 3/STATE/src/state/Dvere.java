/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class Dvere {
    
    private boolean isOpen;
    
    public Dvere(){
        
        isOpen = true;
    }
    
    public boolean isOpened(){
        return isOpen;
    }
    
    public void close(){
        
        isOpen= false;
        
    }
    
}

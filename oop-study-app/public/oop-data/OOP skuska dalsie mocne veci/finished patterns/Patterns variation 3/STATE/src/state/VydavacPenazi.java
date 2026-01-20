/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class VydavacPenazi implements State{

    @Override
    public void handle() {
        System.out.println("Tu su tvoje peniaze... uzi v zdravi.");
    }
    
}

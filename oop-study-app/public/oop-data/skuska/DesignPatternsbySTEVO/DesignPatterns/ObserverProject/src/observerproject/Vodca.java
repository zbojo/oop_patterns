/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package observerproject;

/**
 *
 * @author Stevo
 */
public interface Vodca {
    public void pridajDoKmena(Observer co); //Attach
    public void vykopniZKmena(Observer co); //Attach
    public void damaged(int skody);
    public void zvolajPoradu();
    public int getDamaged();
    public void notify(String code);
}

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
public class ObserverProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vodca incucuna = new Nacelnik();
        Observer indian1= new IndianLukostrelec(incucuna);
        Observer indian2= new IndianSTomahavkom(incucuna);
        Observer indian3= new IndianSTomahavkom(incucuna);
        incucuna.vykopniZKmena(indian3);
        incucuna.zvolajPoradu();
        incucuna.damaged(5);
        incucuna.damaged(6);
    }
    
}

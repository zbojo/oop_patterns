/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facadeproject;

/**
 *
 * @author Stevo
 */
public class FacadeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod
        VelkoobchodFacade MajoCoVsetkoVybavi = new VelkoobchodFacade();
        MajoCoVsetkoVybavi.ZakolkoKupimVsetkoVsklade();
        MajoCoVsetkoVybavi.kolkoJeOvocia();
        MajoCoVsetkoVybavi.donesOvocie();
        MajoCoVsetkoVybavi.kolkoJeOvocia();
        MajoCoVsetkoVybavi.ulozOvocie("Hruska");
        MajoCoVsetkoVybavi.kolkoJeOvocia();
    }
    
}

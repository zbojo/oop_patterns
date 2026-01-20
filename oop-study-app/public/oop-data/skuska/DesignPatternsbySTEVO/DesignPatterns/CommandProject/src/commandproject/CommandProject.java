/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandproject;

/**
 *
 * @author Stevo
 */
public class CommandProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod
        Velkoobchod MajoTheTaskMGR=new Velkoobchod();
        Objednavka pisSpravu=new NapisatHodnotiacuSpravu(MajoTheTaskMGR);
        Objednavka pisSpravu2=new NapisatHodnotiacuSpravu(MajoTheTaskMGR);
        Objednavka pre1=new ZorganizovatAkciu(MajoTheTaskMGR);
        MajoTheTaskMGR.vykonajVsetky();
    }
    
}

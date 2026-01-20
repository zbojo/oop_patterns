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
public class DecoratorProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dodavatel ChemikJano=new Laboratorium(new Umyvaren(new Pestovatel()));
        Dodavatel DonasacJano=new KurierskaSluzba(new Laboratorium(new Umyvaren(new Pestovatel())));
        ChemikJano.DodajSuroviny();
        System.out.println("\n");
        DonasacJano.DodajSuroviny();
    }
    
}

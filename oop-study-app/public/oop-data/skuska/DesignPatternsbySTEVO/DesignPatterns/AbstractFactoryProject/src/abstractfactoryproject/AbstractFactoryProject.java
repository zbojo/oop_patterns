/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactoryproject;

/**
 *
 * @author Stevo
 */
public class AbstractFactoryProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod
        Dodavatel MajoCoVsetkoVybavi = new SkladMisko();
        MajoCoVsetkoVybavi.dodajOvocie("Jablko").papajOvocie();
        MajoCoVsetkoVybavi.dodajOvocie("Slivka").papajOvocie();
        MajoCoVsetkoVybavi.dodajZelenina("Zemiak").papajZelenina();
        MajoCoVsetkoVybavi.dodajZelenina("Karfiol").papajZelenina();
        Dodavatel Bruno = new SkladExotika();
        Bruno.dodajOvocie("Figa").papajOvocie();
        Bruno.dodajZelenina("Arasid").papajZelenina();
    }
    
}

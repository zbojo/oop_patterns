/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naskuskubuilder;

/**
 *
 * @author Stevo
 */
public class NaSkuskuBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chatrc pernikovaChalupka = new Chatrc();
        Hrad balaton = new Hrad();
        Director vyrabacPostav = new Director(balaton);
        Director vyrabacPostav2 = new Director(pernikovaChalupka);
        vyrabacPostav.VytvorPostavu();
        vyrabacPostav.getPostava().Popis();
        vyrabacPostav2.VytvorPostavu();
        vyrabacPostav2.getPostava().Popis();
    }
    
}

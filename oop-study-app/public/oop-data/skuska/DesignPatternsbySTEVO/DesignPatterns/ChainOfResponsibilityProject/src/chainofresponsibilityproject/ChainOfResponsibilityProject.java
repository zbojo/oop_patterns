/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chainofresponsibilityproject;

/**
 *
 * @author Stevo
 */
public class ChainOfResponsibilityProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod
        Sklad skladisko = new SkladMisko(new SkladMatko(new SkladPeter(null)));
        skladisko.dodaj("Broskyna");
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prototypeproject;

/**
 *
 * @author Stevo
 */
public class PrototypeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jablko jabko1=new Jablko();
        jabko1.setName("Granatnik");
        System.out.println(jabko1.getName());
        Jablko jabko2=(Jablko) jabko1.makeCopy();
        System.out.println(jabko2.getName());
    }
    
}

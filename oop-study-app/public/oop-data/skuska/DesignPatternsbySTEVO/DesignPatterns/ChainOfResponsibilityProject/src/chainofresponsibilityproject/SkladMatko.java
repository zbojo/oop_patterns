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
public class SkladMatko implements Sklad{
    
    private Sklad successor;

    public SkladMatko(Sklad succ) {
        this.successor = succ;
    }

    @Override
    public void dodaj(String co) {
        System.out.println("SkladMatko:");
        switch (co) {
            case "Slivka":
                System.out.println("Slivka bola dodana...");
                break;
            case "Hruska":
                System.out.println("Hruska bola dodana...");
                break;
            default:
                if(successor!=null)successor.dodaj(co); else System.out.println("Tak take ovocie sme nikde nenasli...");
        }
    }
    
}

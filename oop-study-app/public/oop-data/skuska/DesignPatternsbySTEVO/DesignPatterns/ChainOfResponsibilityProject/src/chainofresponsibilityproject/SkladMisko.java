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
public class SkladMisko implements Sklad {

    private Sklad successor;

    public SkladMisko(Sklad succ) {
        this.successor = succ;
    }

    @Override
    public void dodaj(String co) {
        System.out.println("SkladMisko:");
        switch (co) {
            case "Banan":
                System.out.println("Banan bol dodany...");
                break;
            case "Kivi":
                System.out.println("Kivi bolo dodany...");
                break;
            default:
                if(successor!=null)successor.dodaj(co); else System.out.println("Tak take ovocie sme nikde nenasli...");
        }
    }
    
}

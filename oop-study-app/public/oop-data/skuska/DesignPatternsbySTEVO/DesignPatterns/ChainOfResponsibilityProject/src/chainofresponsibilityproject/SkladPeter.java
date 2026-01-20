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
public class SkladPeter implements Sklad{
    
    private Sklad successor;

    public SkladPeter(Sklad succ) {
        this.successor = succ;
    }

    @Override
    public void dodaj(String co) {
        System.out.println("SkladPeter:");
        switch (co) {
            case "Broskyna":
                System.out.println("Broskyna bola dodany...");
                break;
            case "Ceresna":
                System.out.println("Ceresna bola dodana...");
                break;
            default:
                if(successor!=null)successor.dodaj(co); else System.out.println("Tak take ovocie sme nikde nenasli...");
        }
    }
}

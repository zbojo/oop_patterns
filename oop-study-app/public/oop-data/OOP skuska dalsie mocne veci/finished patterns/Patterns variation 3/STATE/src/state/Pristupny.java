/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class Pristupny implements State {

    private RiadiaciPanel panel = null;
    private Fakla fakla = null;
    
    public Pristupny(Fakla fakla, RiadiaciPanel panel){
        this.fakla = fakla;
        this.panel = panel;
    }

    

    @Override
    public void handle() {

        System.out.println("Prepinam na dalsi stav...");
        
        if (fakla.jeZatiahnuta()) {
            System.out.println("pustam priseru");
            panel.setState("zabijak");
            panel.pouziPanel();
        } else {
            System.out.println("otvaram trezor");
            panel.setState("vydavac");
            panel.pouziPanel();
        }
    }
}

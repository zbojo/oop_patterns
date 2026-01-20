/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naskuskuabstractfactory;

/**
 *
 * @author Stevo
 */
public class NaSkuskuAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // klient
        VyrobnaPostaviciek ProducentKarkulky = new CarovnyLes();
        VyrobnaPostaviciek ProducentShreka = new KralovstvoFarAway();
        ProducentKarkulky.StvorPostavu().rozpravajAkoPostava();
        ProducentKarkulky.StvorZviera().rozpravajAkoZviera();
        ProducentShreka.StvorPostavu().rozpravajAkoPostava();
        ProducentShreka.StvorZviera().rozpravajAkoZviera();
    }
    
}

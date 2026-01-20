/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitorproject;

/**
 *
 * @author Stevo
 */
public class PrehladavacPolicajt implements Visitor {

    @Override
    public void Visit(Podozrivy po) {
        boolean g = false;
        if (po instanceof PodozrivyMlciaci) {
            g = ((PodozrivyMlciaci) po).Prehladat();
            if (g) {
            System.out.println("JE VINNY!!!");
        } else {System.out.println("JE NEVINNY!!!");}
        } else {
            System.out.println("Naco ho prehladavat, ved vie rozpravat.");
        }
        
    }

}

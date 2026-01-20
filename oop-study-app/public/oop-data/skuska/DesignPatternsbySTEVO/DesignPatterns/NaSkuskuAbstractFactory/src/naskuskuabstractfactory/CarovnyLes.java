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
public class CarovnyLes extends VyrobnaPostaviciek {

    @Override
    public Postava StvorPostavu() {
        return new Karkulka();
    }

    @Override
    public Zviera StvorZviera() {
        return new Vlk();
    }
    
}

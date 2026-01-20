/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypeproject;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Stevo
 */
public class Jablko implements Prototype {
    private String meno;

    public void setName(String nam) {
        this.meno = nam;
    }

    public String getName() {
        return this.meno;
    }

    @Override
    public Prototype makeCopy() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Jablko.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}

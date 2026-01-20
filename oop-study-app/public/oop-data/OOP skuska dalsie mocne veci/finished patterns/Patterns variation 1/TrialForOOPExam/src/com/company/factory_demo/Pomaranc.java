package com.company.factory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Pomaranc extends Ovocie {

    public Pomaranc(String name) {
        super(name,1,2017,"tesco","zapad");
    }

    @Override
    public void vytvor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jem() {
        System.out.println("Kvasny pomaranc...");
    }

}

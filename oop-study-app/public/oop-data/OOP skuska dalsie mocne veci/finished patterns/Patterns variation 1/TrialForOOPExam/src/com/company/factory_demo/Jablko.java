package com.company.factory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Jablko extends Ovocie {

    public Jablko(String name) {
        super(name,2,2017,"lidl","zapad");
    }

    @Override
    public void vytvor() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void jem() {
        System.out.println("Sladke jablko...");
    }
}

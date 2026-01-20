package com.company.skuska.decorator;

public class Hrac implements Postava {

    private String cinnost;

    public Hrac() {
        this.cinnost = "pohyb a chodza";
    }

    @Override
    public void vypisCinnost() {
        System.out.print(cinnost);
    }
}

package com.company.skuska.decorator;

public class Mobil extends Cinnost {

    private String cinnost;

    public Mobil(Postava postava) {
        super(postava);
        cinnost = "telefonovanie";
    }

    @Override
    public void vypisCinnost() {
        super.vypisCinnost();
        System.out.print(", " + cinnost);
    }
}

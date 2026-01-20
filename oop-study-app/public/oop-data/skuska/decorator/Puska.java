package com.company.skuska.decorator;

public class Puska extends Cinnost {

    private String cinnost;

    public Puska(Postava postava) {
        super(postava);
        cinnost = "strielanie";
    }

    @Override
    public void vypisCinnost() {
        super.vypisCinnost();
        System.out.print(", " + cinnost);
    }
}

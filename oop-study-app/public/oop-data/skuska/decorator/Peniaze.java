package com.company.skuska.decorator;

public class Peniaze extends Cinnost {

    private String cinnost;

    public Peniaze(Postava postava) {
        super(postava);
        cinnost = "nakup a predaj";
    }

    @Override
    public void vypisCinnost() {
        super.vypisCinnost();
        System.out.print(", " + cinnost);
    }
}

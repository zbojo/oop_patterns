package com.company.skuska.decorator;

public abstract class Cinnost implements Postava {

    private Postava postava;

    public Cinnost(Postava postava) {
        this.postava = postava;
    }

    @Override
    public void vypisCinnost() {
        postava.vypisCinnost();
    }
}

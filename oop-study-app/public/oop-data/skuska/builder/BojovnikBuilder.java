package com.company.skuska.builder;

public class BojovnikBuilder implements PostavaBuilder {

    private Postava postava;

    public BojovnikBuilder() {
        postava = new Bojovnik();
    }

    @Override
    public void vytvorOblecenie() {
        postava.setOblecenie("kruzkova kosela");
    }

    @Override
    public void vytvorZbran() {
        postava.setZbran("mec");
    }

    @Override
    public void vytvorSpravanie() {
        postava.setSpravanie("bojuj");
    }

    @Override
    public Postava getPostava() {
        return postava;
    }
}

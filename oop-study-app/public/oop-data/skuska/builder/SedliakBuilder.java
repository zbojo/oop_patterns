package com.company.skuska.builder;

public class SedliakBuilder implements PostavaBuilder {

    private Postava postava;

    public SedliakBuilder() {
        postava = new Sedliak();
    }

    @Override
    public void vytvorOblecenie() {
        postava.setOblecenie("platena kosela");
    }

    @Override
    public void vytvorZbran() {
        postava.setZbran("motyka");
    }

    @Override
    public void vytvorSpravanie() {
        postava.setSpravanie("utekaj");
    }

    @Override
    public Postava getPostava() {
        return postava;
    }
}

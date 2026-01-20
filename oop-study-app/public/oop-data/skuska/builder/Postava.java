package com.company.skuska.builder;

public class Postava {

    private String oblecenie;
    private String zbran;
    private String spravanie;

    public void setOblecenie(String oblecenie) {
        this.oblecenie = oblecenie;
    }

    public void setZbran(String zbran) {
        this.zbran = zbran;
    }

    public void setSpravanie(String spravanie) {
        this.spravanie = spravanie;
    }

    @Override
    public String toString() {
        return String.format("%s\noblecenie: %s\nzbran: %s\nspravanie: %s\n", getClass().getSimpleName(), oblecenie, zbran, spravanie);
    }
}

package com.company.factory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public abstract class Ovocie {
    private int cena;
    private int trvanlivostDo;
    private String povod;
    private String dodavatel;
    private String name;

    public Ovocie(String name,int cena,int trvanlivostDo,String dodavatel, String povod){
        this.name = name;
        this.cena = cena;
        this.trvanlivostDo = trvanlivostDo;
        this.povod = povod;
        this.dodavatel = dodavatel;
    }

    public abstract void vytvor();
    public abstract void jem();

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getTrvanlivostDo() {
        return trvanlivostDo;
    }

    public void setTrvanlivostDo(int trvanlivostDo) {
        this.trvanlivostDo = trvanlivostDo;
    }

    public String getPovod() {
        return povod;
    }

    public void setPovod(String povod) {
        this.povod = povod;
    }

    public String getDodavatel() {
        return dodavatel;
    }

    public void setDodavatel(String dodavatel) {
        this.dodavatel = dodavatel;
    }
}

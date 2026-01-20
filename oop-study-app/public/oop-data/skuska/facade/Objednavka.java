package com.company.skuska.facade;

public class Objednavka {

    private Tovar tovar;
    private Dodavatel dodavatel;
    private int mnozstvo;

    public Objednavka(Tovar tovar, Dodavatel dodavatel, int mnozstvo) {
        this.tovar = tovar;
        this.dodavatel = dodavatel;
        this.mnozstvo = mnozstvo;
    }

    public void objednaj() {
        System.out.println(String.format("%s, %s, %.2f, %d", dodavatel.getName(), tovar.getName(), tovar.getPrice(), mnozstvo));
    }
}

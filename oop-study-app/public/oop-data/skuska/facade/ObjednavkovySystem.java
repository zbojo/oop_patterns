package com.company.skuska.facade;

public class ObjednavkovySystem {

    public void objednavka(String nazovTovaru, double cena, int mnozstvo, String nazovDodavatela) {

        Objednavka objednavka = new Objednavka(
                new Tovar(nazovTovaru, cena),
                new Dodavatel(nazovDodavatela),
                mnozstvo
        );

        objednavka.objednaj();
    }
}

package com.company.iterator_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class Zamestnanec {

    String meno;
    String priezvisko;
    int plat;

    public Zamestnanec(String meno, String priezvisko, int plat) {
        this.meno = meno;
        this.plat = plat;
        this.priezvisko = priezvisko;
    }

    public String getName() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }

    public int getPlat() {
        return this.plat;
    }
}

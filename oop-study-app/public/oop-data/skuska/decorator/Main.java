package com.company.skuska.decorator;

public class Main {

    public static void main(String[] args) {
        Postava postava = new Mobil(new Peniaze(new Puska(new Hrac())));

        postava.vypisCinnost();
        System.out.println();

        postava = new Peniaze(new Hrac());
        postava.vypisCinnost();
        System.out.println();
    }
}

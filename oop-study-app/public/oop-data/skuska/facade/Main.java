package com.company.skuska.facade;

public class Main {

    public static void main(String[] args) {

        ObjednavkovySystem objednavkovySystem = new ObjednavkovySystem();

        objednavkovySystem.objednavka("iPhone", 699.99d, 4, "iStores");
        objednavkovySystem.objednavka("kalkulacka", 25d, 20, "alza");
        objednavkovySystem.objednavka("pentelka", 0.3d, 300, "sevt");
        objednavkovySystem.objednavka("klavesnica", 12d, 25, "lenovo");

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naskuskuiterator;

import java.util.ArrayList;

/**
 *
 * @author Stevo
 */
public class NaSkuskuIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteAggregateLinkedList zborovna = new ConcreteAggregateLinkedList();
        zborovna.addZamestnanec(new Zamestnanec("Lubomir", "Lazor", 700));
        zborovna.addZamestnanec(new Zamestnanec("Paly", "Petrovsky", 800));
        zborovna.addZamestnanec(new Zamestnanec("Katarina", "Fedorova", 600));
        zborovna.addZamestnanec(new Zamestnanec("Anzka", "Richtarikova", 650));
        zborovna.addZamestnanec(new Zamestnanec("Jan", "Kanuk", 700));
        ConcreteIteratorLinkedList ite = zborovna.createIterator();
        ite.first();
        while (!ite.isDone()) {
            System.out.println("Meno: " + ite.currentItem().getMeno());
            System.out.println("Priezvisko: " + ite.currentItem().getPriezvisko());
            System.out.println("Plat: " + ite.currentItem().getPlat());
            System.out.println("\n");
             ite.next();
        }
    }

}


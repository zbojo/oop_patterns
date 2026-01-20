package com.company.observer;

import java.util.ArrayList;
import java.util.List;

//Observable
public class ServerWolrd {

    private List<Observ> observers = new ArrayList<>();

    public void treeFell() {
        System.out.println("boom!");
        notifyObservers("spadol strom");
    }

    public void kingDied() {
        System.out.println("Waagh!");
        notifyObservers("umrel kral");
    }

    public void addObserver(Observ observ) {
        observers.add(observ);
    }


    public void notifyObservers(String what) {
        for (Observ observer : observers) {
            observer.react(what);
        }
    }
}

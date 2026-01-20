package com.company.observerlecture;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers;

    public Subject() {
        this.observers = new LinkedList<>();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void dettach(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : this.observers)
            observer.update();
    }

}

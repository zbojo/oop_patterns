package com.company.observer_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteObserverB implements Observer{
    private ConcreteObservable co;
    private String state;

    public ConcreteObserverB(ConcreteObservable co){
        this.co=co;
    }

    @Override
    public void update() {
        this.state=co.getState();
        System.out.println("mail> "+this.state);
    }
}
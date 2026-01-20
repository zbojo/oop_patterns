package com.company.observer_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteObserverA implements Observer{
    private ConcreteObservable co;
    private String state;

    public ConcreteObserverA(ConcreteObservable co) {
        this.co = co;
    }

    @Override
    public void update() {
        this.state=co.getState();
        System.out.println("sms> "+this.state);
    }
}
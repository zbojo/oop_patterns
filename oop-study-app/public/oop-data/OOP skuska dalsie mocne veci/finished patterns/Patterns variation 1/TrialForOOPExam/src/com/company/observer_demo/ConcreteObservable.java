package com.company.observer_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteObservable implements Observable {
    private String state;
    private List<Observer> observers = new ArrayList<>();


    public ConcreteObservable(){

    }

    public String getState(){
        return this.state;
    }

    public void setState(String state){
        this.state=state;
        notif();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notif() {
        for(Observer o: observers){
            o.update();
        }
    }





}
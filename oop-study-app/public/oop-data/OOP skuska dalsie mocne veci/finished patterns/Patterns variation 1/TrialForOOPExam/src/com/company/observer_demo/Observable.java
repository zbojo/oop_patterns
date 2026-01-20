package com.company.observer_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public interface Observable {
    void attach(Observer observer);
    void detach(Observer observer);
    void notif();
}

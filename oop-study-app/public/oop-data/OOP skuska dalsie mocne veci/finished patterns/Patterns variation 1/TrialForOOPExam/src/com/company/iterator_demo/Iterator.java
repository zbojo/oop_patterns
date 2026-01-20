package com.company.iterator_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public interface Iterator {
    Zamestnanec first();
    Zamestnanec next();
    boolean isDone();
    Zamestnanec currentItem();
}

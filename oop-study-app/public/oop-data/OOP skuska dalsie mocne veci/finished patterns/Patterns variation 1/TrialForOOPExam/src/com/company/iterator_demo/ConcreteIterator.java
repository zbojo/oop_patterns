package com.company.iterator_demo;

import java.util.ArrayList;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteIterator implements Iterator {
    private ArrayList<Zamestnanec> zoznam;
    private int index;

    public ConcreteIterator(ArrayList<Zamestnanec> zoznamZamestnancov) {
        zoznam = zoznamZamestnancov;
        this.index = 0;
    }

    @Override
    public Zamestnanec first() {
        this.index = 0;
        return zoznam.get(index);
    }

    @Override
    public Zamestnanec next() {
        if (index < zoznam.size()) {
            return zoznam.get(index++);
        } else {
            return null;
        }
    }

    @Override
    public boolean isDone() {
        return (zoznam.size() == index);
    }

    @Override
    public Zamestnanec currentItem() {
        if (index < zoznam.size()) {
            return zoznam.get(index);
        } else {
            return null;
        }
    }
}

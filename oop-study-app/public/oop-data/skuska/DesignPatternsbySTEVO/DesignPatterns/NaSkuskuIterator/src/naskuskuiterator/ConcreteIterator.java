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

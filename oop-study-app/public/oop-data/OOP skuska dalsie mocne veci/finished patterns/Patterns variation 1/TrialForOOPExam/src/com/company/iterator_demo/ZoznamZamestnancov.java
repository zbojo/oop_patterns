package com.company.iterator_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ZoznamZamestnancov implements Aggregate{
    private ArrayList<Zamestnanec> zoznam = new ArrayList<>();

    public void add(Zamestnanec z){
        zoznam.add(z);
    }
    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(zoznam);
    }


}

package com.company.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GarbageCan implements java.lang.Iterable<Disposable> {

    private ArrayList<Disposable> stuff = new ArrayList<>();

    public void binIt(Disposable garbage) {
        stuff.add(garbage);
    }

    @Override
    public Iterator<Disposable> iterator() {
        return stuff.iterator();
    }
}

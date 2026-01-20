package com.company.iteratorlecture;

import java.util.LinkedList;

// Implement my list as an extension of LinkedList<T> from Java
public class MyList<T> extends LinkedList<T> implements AbstractList<T> {

    @Override
    public Iterator<T> getIterator() {
        return new MyListIterator<>(this);
    }

}

package com.company.iteratorlecture;

public class MyListIterator<T> implements Iterator<T> {

    private MyList<T> list;
    private int index;

    public MyListIterator(MyList<T> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public void first() {
        this.index = 0;
    }

    @Override
    public void next() {
        if (this.index < this.list.size())
            this.index++;
    }

    @Override
    public boolean isDone() {
        return this.index == this.list.size();
    }

    @Override
    public T currentItem() {
        if (this.index < this.list.size())
            return this.list.get(this.index);
        return null;
    }

}

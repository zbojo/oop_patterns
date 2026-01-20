package IteratorPrep;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator
{
    private ArrayList<Zamestnanec> listOfZamestnanecs;
    private int index;

    public ConcreteIterator(ArrayList<Zamestnanec> newListOfZamestnanecs)
    {
        this.setIndex(0);
        this.setListOfZamestnanecs(newListOfZamestnanecs);
    }

    @Override
    public Zamestnanec first()
    {
        if (this.getListOfZamestnanecs() == null) return null;
        this.setIndex(0);
        return this.getListOfZamestnanecs().get(this.getIndex());
    }

    @Override
    public Zamestnanec next()
    {
        if (this.getIndex() >= this.getListOfZamestnanecs().size()) return null;
        return this.getListOfZamestnanecs().get(this.index++);
    }

    @Override
    public boolean isDone()
    {
        if (this.getListOfZamestnanecs() != null) return this.getIndex() == this.getListOfZamestnanecs().size();
        return false;
    }

    @Override
    public Zamestnanec currentItem()
    {
        if (this.getIndex() >= this.getListOfZamestnanecs().size()) return null;
        return this.getListOfZamestnanecs().get(this.getIndex());
    }

    public void setListOfZamestnanecs(ArrayList<Zamestnanec> listOfZamestnanecs)
    {
        this.listOfZamestnanecs = listOfZamestnanecs;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public ArrayList<Zamestnanec> getListOfZamestnanecs()
    {
        return this.listOfZamestnanecs;
    }

    public int getIndex()
    {
        return this.index;
    }
}

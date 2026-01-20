package IteratorPrep;

import java.util.ArrayList;

public abstract class Aggregate
{
    ArrayList<Zamestnanec> zamestnanci;
    public abstract Iterator createIterator();
    public abstract void addZamestnanec(Zamestnanec newZamestnanec);
}

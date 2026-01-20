package IteratorPrep;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate
{
    public ConcreteAggregate()
    {
        zamestnanci = new ArrayList<Zamestnanec>();
    }

    @Override
    public ConcreteIterator createIterator()
    {
        return new ConcreteIterator(zamestnanci);
    }

    @Override
    public void addZamestnanec(Zamestnanec newZamestnanec)
    {
        zamestnanci.add(newZamestnanec);
    }
}

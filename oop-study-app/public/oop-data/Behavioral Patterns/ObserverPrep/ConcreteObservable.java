package ObserverPrep;

import java.io.Serial;
import java.util.ArrayList;

public class ConcreteObservable implements Observable
{

    ArrayList<Observer> observers;
    private int ZlatyBazantPrice;
    private int KrusovicePrice;
    private int SvijanyPrice;

    public ConcreteObservable()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer)
    {
        if (this.observers != null) this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer)
    {
        if (this.observers != null)
        {
            System.out.println("\nRemoved observer number" + observers.indexOf(observer) + 1);
            this.observers.remove(observers.indexOf(observer));
        }
    }

    @Override
    public void notifyObserver()
    {
        for (Observer observer : observers) observer.update(this.getZlatyBazantPrice(), this.getKrusovicePrice(), this.getSvijanyPrice());
    }

    public void setZlatyBazantPrice(int price)
    {
        this.ZlatyBazantPrice = price;
    }

    public void setKrusovicePrice(int price)
    {
        this.KrusovicePrice = price;
    }

    public void setSvijanyPrice(int price)
    {
        this.SvijanyPrice = price;
    }

    public int getZlatyBazantPrice()
    {
        return this.ZlatyBazantPrice;
    }

    public int getKrusovicePrice()
    {
        return this.KrusovicePrice;
    }

    public int getSvijanyPrice()
    {
        return this.SvijanyPrice;
    }
}

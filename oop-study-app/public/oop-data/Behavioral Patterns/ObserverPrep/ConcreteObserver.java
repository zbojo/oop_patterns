package ObserverPrep;

public class ConcreteObserver implements Observer
{
    private Observable observable;
    private int observerID;
    private static int observerIDTracker = 0;

    private int ZlatyBazantPrice;
    private int KrusovicePrice;
    private int SvijanyPrice;

    public ConcreteObserver(Observable observable)
    {
        this.observable = observable;
        this.observerID = this.observerIDTracker++;
        System.out.println("\nregistered observer number: " + this.observerID);
        this.observable.attach(this);
    }

    @Override
    public void update(int zlaty, int krusovice, int svijany)
    {
        this.ZlatyBazantPrice = zlaty;
        this.KrusovicePrice = krusovice;
        this.SvijanyPrice = svijany;
        System.out.println("Observer: " + this.observerID +
                "\nzlaty bazant: " + this.ZlatyBazantPrice + "\nkrusovice: " + this.KrusovicePrice + "\nsvijany: " + this.SvijanyPrice);
    }
}

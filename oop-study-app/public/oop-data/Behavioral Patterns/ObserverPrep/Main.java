package ObserverPrep;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteObservable ConcreteObservableA = new ConcreteObservable();
        ConcreteObserver observer1 = new ConcreteObserver(ConcreteObservableA);
        ConcreteObservableA.setZlatyBazantPrice(1);
        ConcreteObservableA.setKrusovicePrice(2);
        ConcreteObservableA.setSvijanyPrice(3);
        ConcreteObservableA.notifyObserver();

        ConcreteObserver observer2 = new ConcreteObserver(ConcreteObservableA);
        ConcreteObservableA.setZlatyBazantPrice(4);
        ConcreteObservableA.setKrusovicePrice(5);
        ConcreteObservableA.setSvijanyPrice(6);
        ConcreteObservableA.notifyObserver();

        ConcreteObservableA.detach(observer1);
        ConcreteObservableA.notifyObserver();
    }
}

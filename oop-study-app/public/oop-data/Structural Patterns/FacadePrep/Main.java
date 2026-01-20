package FacadePrep;

public class Main
{
    public static void main(String[] args)
    {
        HyperMarket hyperMarket = new HyperMarket();
        hyperMarket.order(10);
        hyperMarket.store("Fruit");
        System.out.println("All cost: " + hyperMarket.getAllCost());
        hyperMarket.SaveFruit("Fruit");
        System.out.println("Fruits amount: " + hyperMarket.getFruitsAmount());
    }
}

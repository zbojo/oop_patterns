package FacadePrep;

public class HyperMarket
{
    private Shop shop;
    private Warehouse warehouse;

    public HyperMarket()
    {
        shop = new Shop();
        warehouse = new Warehouse();
    }

    public void order(int amount)
    {
        int cost = shop.getCost(amount);
        System.out.println("Cost: " + cost);
        warehouse.deliver();
        shop.order();
    }

    public void store(String item)
    {
        warehouse.store(item);
    }

    public int getAllCost()
    {
        return shop.getCost(warehouse.getAmount());
    }

    public void SaveFruit(String fruit)
    {
        warehouse.store(fruit);
    }

    public int getFruitsAmount()
    {
        return warehouse.getAmount();
    }
}

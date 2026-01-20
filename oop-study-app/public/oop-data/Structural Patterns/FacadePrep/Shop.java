package FacadePrep;

public class Shop
{
    public int getCost(int amount)
    {
        return amount * 10;
    }

    public void order()
    {
        System.out.println("Ordering...");
    }
}

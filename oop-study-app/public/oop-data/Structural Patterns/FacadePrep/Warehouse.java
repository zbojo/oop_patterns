package FacadePrep;

public class Warehouse
{
    private int amount;

    public Warehouse()
    {
        amount = 100;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int newAmount)
    {
        amount = newAmount;
    }

    public void deliver()
    {
        System.out.println("Delivering...");
        amount--;
    }

    public void store(String item)
    {
        System.out.println("Storing " + item + ".");
        amount++;
    }
}

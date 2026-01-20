package FactoryPrep;

public class ConcreteProduct implements Product
{
    private String name;
    private static int number = 0;
    private int ID;
    public ConcreteProduct(String name)
    {
        this.name = name;
        this.ID = this.number++;
    }

    public int getID()
    {
        return this.ID;
    }
}

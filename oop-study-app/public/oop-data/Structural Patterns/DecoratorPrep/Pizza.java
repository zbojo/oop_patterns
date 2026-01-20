package DecoratorPrep;

public class Pizza implements Component
{
    private String name;
    private double price;

    public Pizza(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public void doSomething()
    {
        System.out.println("Default Pizza " + name + " costs " + price);
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }
}


package FactoryPrep;

public class ConcreteFactory implements Factory
{
    private String name;

    public ConcreteFactory(String name)
    {
        this.name = name;
    }

    @Override
    public Product FactoryMethod(String name)
    {
        switch (name)
        {
            case "product1":
                    System.out.println("found in factory\n");
                    return new ConcreteProduct(name);
            default:
                    System.out.println("not found in factory\n");
                    return null;
        }
    }

    @Override
    public void doSomething()
    {
        System.out.println("product: ");
    }
}

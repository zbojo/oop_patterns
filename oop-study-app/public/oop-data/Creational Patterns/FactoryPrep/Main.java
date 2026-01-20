package FactoryPrep;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteFactory factory = new ConcreteFactory("ConcereteFactory1");
        Product product = factory.FactoryMethod("product1");
        factory.doSomething();

        Product product2 = factory.FactoryMethod("product2");
        factory.doSomething();
    }
}

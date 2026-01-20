package AbstractFactoryPrep;

public class Main
{
    public static void main(String[] args)
    {
        ConcreteFactory1 factoryOne = new ConcreteFactory1();
        ConcreteFactory2 factoryTwo = new ConcreteFactory2();

        AbstractProductA A1 = factoryOne.createProductA();
        AbstractProductB B1 = factoryOne.createProductB();

        AbstractProductA A2 = factoryTwo.createProductA();
        AbstractProductB B2 = factoryTwo.createProductB();

    }
}

package DecoratorPrep;

public class SpicyPizza extends Decorator
{
    public SpicyPizza(Component component)
    {
        super(component);
    }

    @Override
    public void doSomething()
    {
        super.doSomething();
        System.out.println("Spicy Pizza");
    }
}

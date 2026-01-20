package DecoratorPrep;

public class HawaiiPizza extends Decorator
{
    public HawaiiPizza(Component component)
    {
        super(component);
    }

    @Override
    public void doSomething()
    {
        super.doSomething();
        System.out.println("Hawaii Pizza");
    }
}

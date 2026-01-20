package DecoratorPrep;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Component> components = new ArrayList<>();

        components.add(new Pizza("Pizza 1", 10));
        components.add(new Pizza("Pizza 2", 20));
        components.add(new Pizza("Pizza 3", 30));
        components.add(new Pizza("Pizza 4", 40));
        components.add(new Pizza("Pizza 5", 50));


        components.add(new SpicyPizza(new Pizza("Pizza 1", 10)));
        components.add(new SpicyPizza(new Pizza("Pizza 2", 20)));
        components.add(new SpicyPizza(new Pizza("Pizza 3", 30)));
        components.add(new SpicyPizza(new Pizza("Pizza 4", 40)));

        components.add(new HawaiiPizza(new Pizza("Pizza 1", 10)));
        components.add(new HawaiiPizza(new Pizza("Pizza 2", 20)));
        components.add(new HawaiiPizza(new Pizza("Pizza 3", 30)));
        components.add(new HawaiiPizza(new Pizza("Pizza 4", 40)));

        for (Component component : components)
        {
            component.doSomething();
        }
    }
}

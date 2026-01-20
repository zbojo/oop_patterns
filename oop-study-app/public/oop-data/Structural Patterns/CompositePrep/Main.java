package CompositePrep;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Composite composite = new Composite("composite");

        for (int i = 0; i < 10; i++)
        {
            Leaf leaf = new Leaf("leaf" + i);
            composite.addComponent(leaf);
        }

        System.out.println(composite.getName() + " size: " + composite.getAmount());

        for (int i = 0; i < composite.getAmount(); i++)
        {
            System.out.println(i + 1 + "th component in composite is: " + composite.getComponent(i).getName());
        }
    }
}

package CompositePrep;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component
{
    private String name;
    private int amount;
    private List<Component> components = new ArrayList<>();

    public Composite(String name)
    {
        this.name = name;
    }

    public void addComponent(Component c)
    {
        this.components.add(c);
    }

    public void removeComponent(Component c)
    {
        this.components.remove(c);
    }

    public Component getComponent(int index)
    {
        return this.components.get(index);
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public int getAmount()
    {
        return components.size();
    }
}
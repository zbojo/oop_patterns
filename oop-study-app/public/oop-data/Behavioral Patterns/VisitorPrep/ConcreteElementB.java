package VisitorPrep;

import java.util.Random;

public class ConcreteElementB implements Sus
{
    private boolean guilty;
    private String name;
    Random random = new Random();
    public ConcreteElementB(String name)
    {
        this.name = name;
        guilty = random.nextBoolean();
    }

    public boolean isGuilty()
    {
        return this.guilty;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

    public String getName()
    {
        return this.name;
    }
}

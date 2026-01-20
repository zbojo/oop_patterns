package VisitorPrep;

import java.util.Random;

public class ConcreteElementA implements Sus
{
    private boolean guilty;
    private String name;
    Random random = new Random();
    public ConcreteElementA(String name)
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

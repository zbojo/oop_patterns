package StrategyPrep;

public class Main
{
    public static void main(String[] args)
    {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.behave();

        context.setStrategy(new ConcreteStrategyB());
        context.behave();

        context.setStrategy(new ConcreteStrategyC());
        context.behave();
    }
}

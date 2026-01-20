package StrategyPrep;

public class Context
{
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void behave()
    {
        this.strategy.BehaviorInterface();
    }
}

package com.company.strategy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class Context implements Strategy {
    private String name;
    private Strategy strategy;

    @Override
    public void strategyBehavior() {
        System.out.println(this.name + ": ");
        this.strategy.strategyBehavior();
    }

    public void setName(String meno){
        this.name = meno;
    }

    public void setStrategy(Strategy spravanie){
        this.strategy = spravanie;
    }
}

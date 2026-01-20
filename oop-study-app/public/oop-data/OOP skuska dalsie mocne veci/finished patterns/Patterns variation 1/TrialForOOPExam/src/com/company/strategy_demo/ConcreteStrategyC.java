package com.company.strategy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteStrategyC implements Strategy {

    @Override
    public void strategyBehavior() {
        System.out.println("Som neutralny robot, ignorujem");
    }
}

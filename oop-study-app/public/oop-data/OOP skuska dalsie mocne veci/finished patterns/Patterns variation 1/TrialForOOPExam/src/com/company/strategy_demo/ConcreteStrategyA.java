package com.company.strategy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteStrategyA implements Strategy {

    @Override
    public void strategyBehavior() {
        System.out.println("Som agresivny robot, utocim");
    }
}

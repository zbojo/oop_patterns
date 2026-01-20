package com.company.abstractFactory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        AbstractProductA princezna = new ProductA1();
        return princezna;
    }

    @Override
    public AbstractProductB createProductB() {
        AbstractProductB drak = new ProductB1();
        return drak;
    }
}

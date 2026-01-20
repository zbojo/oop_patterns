package com.company.abstractFactory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        AbstractProductA cervenaCiapocka = new ProductA2();
        return cervenaCiapocka;
    }

    @Override
    public AbstractProductB createProductB() {
        AbstractProductB vlk = new ProductB2();
        return vlk;
    }
}

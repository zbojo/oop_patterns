package com.company.abstractFactory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class ProductA2 implements AbstractProductA {
    public ProductA2(){
        this.rozpravaj();
    }
    @Override
    public void rozpravaj() {
        System.out.println("Princezna bude len moja");
    }
}

package com.company.abstractFactory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class ProductB2 implements AbstractProductB {
    public ProductB2(){
        this.rozpravaj();
    }
    @Override
    public void rozpravaj() {
        System.out.println("To aby som ta lepsie videla");
    }
}

package com.company.abstractFactory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class ProductA1 implements AbstractProductA {
    public ProductA1(){
        this.rozpravaj();
    }
    @Override
    public void rozpravaj() {
        System.out.println("Cakam na svojho princa");
    }
}

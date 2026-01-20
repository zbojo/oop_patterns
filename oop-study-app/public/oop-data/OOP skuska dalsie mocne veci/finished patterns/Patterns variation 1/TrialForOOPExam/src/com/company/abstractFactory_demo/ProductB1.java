package com.company.abstractFactory_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class ProductB1 implements AbstractProductB {
    public ProductB1(){
        this.rozpravaj();
    }
    @Override
    public void rozpravaj() {
        System.out.println("Babicka preco mas tak velke oci");
    }
}

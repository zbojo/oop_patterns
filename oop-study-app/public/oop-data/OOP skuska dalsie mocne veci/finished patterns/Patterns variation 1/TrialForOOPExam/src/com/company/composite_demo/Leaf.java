package com.company.composite_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class Leaf implements ComponentC {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int spocitaj() {
        return 1;
    }
}

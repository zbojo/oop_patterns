package com.company.prototype_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Apple implements Prototype {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Apple(){

    }

    @Override
    public Prototype makeCopy() {
        try {
            return (Apple) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

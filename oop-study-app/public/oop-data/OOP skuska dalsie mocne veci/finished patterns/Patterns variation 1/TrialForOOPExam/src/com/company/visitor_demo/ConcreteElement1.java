package com.company.visitor_demo;

import java.util.Random;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ConcreteElement1 implements Element {
    private String name;
    private boolean vinnost;
    Random generator = new Random();

    public ConcreteElement1(String name){
        this.name = name;
        this.vinnost = generator.nextBoolean();
    }



    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public boolean getVina1(){
        return this.vinnost;
    }
}

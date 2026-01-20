package com.company.composite_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class Composite implements ComponentC {
    private List<ComponentC> componentList = new ArrayList<>();
    private int pocetSuborov;
    private String name;

    public Composite(String name){
        this.name = name;
    }

    public void vlozDoZlozky(ComponentC c){
        componentList.add(c);
    }

    public void vymazSubor(ComponentC c){
        componentList.remove(c);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int spocitaj() {
        pocetSuborov=componentList.size();
        return pocetSuborov;
    }
}

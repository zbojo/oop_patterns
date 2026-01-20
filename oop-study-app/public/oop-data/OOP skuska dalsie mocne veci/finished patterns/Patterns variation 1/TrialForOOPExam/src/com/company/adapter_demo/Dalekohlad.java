package com.company.adapter_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */

//ADAPTER
public class Dalekohlad implements Pozorovanie{
    private Hviezda hviezda;

    public Dalekohlad(Hviezda hviezda){
        this.hviezda = hviezda;
    }
    @Override
    public void svetlo() {
        hviezda.typHviezdy();
    }
}

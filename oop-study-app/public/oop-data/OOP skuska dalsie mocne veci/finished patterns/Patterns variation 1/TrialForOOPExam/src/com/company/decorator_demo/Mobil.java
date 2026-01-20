package com.company.decorator_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class Mobil extends Decorator{

    public Mobil(Component component){
        super(component);
    }
    @Override
    public void vypisCinnost() {
        super.vypisCinnost();
        System.out.println("Mozem telefonovat");
    }
}

package com.company.decorator_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void vypisCinnost(){
        component.vypisCinnost();
    }

}

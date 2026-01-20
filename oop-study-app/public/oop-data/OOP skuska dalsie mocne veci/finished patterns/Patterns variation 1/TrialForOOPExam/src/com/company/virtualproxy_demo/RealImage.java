package com.company.virtualproxy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class RealImage implements Image {
    private String name;

    public RealImage(String name){
        this.name = name;
    }
    @Override
    public void displayImage() {
        System.out.println("Zobrazuje sa obrazok" + this.name);
    }

    public void loadImage(){
        System.out.println("Nacitava sa obrazok" + this.name);
    }
}

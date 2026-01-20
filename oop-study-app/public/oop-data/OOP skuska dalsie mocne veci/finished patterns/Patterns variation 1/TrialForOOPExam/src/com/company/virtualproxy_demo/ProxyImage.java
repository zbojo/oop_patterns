package com.company.virtualproxy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ProxyImage implements Image {
    private String name;
    public RealImage image;
    public ProxyImage(String name){
        this.name = name;
    }
    @Override
    public void displayImage() {
        if (image == null){
            image = new RealImage(this.name);
            image.loadImage();
            image.displayImage();
        }
        else {
            image.displayImage();
        }
    }
}

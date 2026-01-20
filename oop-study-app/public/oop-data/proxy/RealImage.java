package com.company.proxy;

public class RealImage implements Image {

    private String name;

    public RealImage(String name) {
        this.name = name;

        // Every creation of real image object requires long-time operation of loading.
        // This we want to avoid by proxy image.
        System.out.println("Loading image " + this.name + "...");
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying image " + this.name + "...");
    }
}

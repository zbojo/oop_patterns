package com.company.proxy;

public class Main {

    public static void main(String[] args) {

        System.out.println("Create all images (it is fast, because nothing is loaded).");

        // Create first image
        Image image1 = new ProxyImage("image1");

        // Create second image
        Image image2 = new ProxyImage("image2");

        System.out.println("Display all images twice (images are loaded before the first display).");

        // The images are loaded and displayed twice
        image1.displayImage();
        image2.displayImage();
        image1.displayImage();
        image2.displayImage();
    }
}

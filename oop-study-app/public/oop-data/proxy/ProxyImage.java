package com.company.proxy;

public class ProxyImage implements Image {

    private String name;
    private RealImage realImage;

    public ProxyImage(String name) {
        this.name = name;
        this.realImage = null;  // Real image is not loaded during initialization, so creation of image is fast.
    }

    @Override
    public void displayImage() {
        // Load the real image when image is displayed for the first time.
        if (this.realImage == null)
            this.realImage = new RealImage(this.name);

        this.realImage.displayImage();
    }
}

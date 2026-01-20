package com.company.singleton;

public class Main {

    public static void main(String[] args) {

        // Save files to a single storage
        Storage.getInstance().saveFile("text", "This is a text file.");
        Storage.getInstance().saveFile("video", "This is a video file.");

        // Load files from a single storage and display their content
        System.out.println(Storage.getInstance().loadFile("text"));
        System.out.println(Storage.getInstance().loadFile("video"));
    }

}

package com.company.composite;

public class Main {

    public static void main(String[] args) {

        // Create files and directories
        Node file1 = new File("file1");
        Node file2 = new File("file2");
        Node file3 = new File("file3");
        Node dir1 = new Directory("dir1");
        Node dir2 = new Directory("dir2");
        Node dir3 = new Directory("dir3");
        Node root = new Directory("root");

        // Add files into directories
        root.add(dir1);
        root.add(dir2);
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(dir3);
        dir3.add(file3);

        // List root directory
        root.list();
    }
}

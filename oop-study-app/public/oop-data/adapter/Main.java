package com.company.adapter;

public class Main {

    public static void main(String[] args) {

        // Get document from database
        DocumentAdapter database = new DatabaseAdapter();
        Document document1 = database.getDocument("name1");
        System.out.println(document1);

        // Get document from file system
        DocumentAdapter fileSystem = new FileSystemAdapter();
        Document document2 = fileSystem.getDocument("name2");
        System.out.println(document2);
    }
}

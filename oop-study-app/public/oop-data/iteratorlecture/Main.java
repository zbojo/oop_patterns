package com.company.iteratorlecture;

public class Main {

    public static void main(String[] args) {

        // Create my list of strings
        MyList<String> list = new MyList<>();

        // Add some strings to my list
        list.add("Martin");
        list.add("Jozef");
        list.add("Janka");

        // Get iterator of my list
        Iterator<String> iterator = list.getIterator();

        // Iterate my list using iterator of my list
        for (iterator.first(); !iterator.isDone(); iterator.next())
            System.out.println(iterator.currentItem());
    }

}

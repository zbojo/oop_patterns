package com.company.iterator;

public class Main {

    public static void main(String[] args) {

        GarbageCan can = new GarbageCan();

        Paper paper = new Paper();
        Pen pen = new Pen();

        can.binIt(paper);
        can.binIt(pen);

        for (Disposable disposable : can) { // can implementuje Iterable a odtial si potiahne iterator()
            System.out.println(disposable.getClass().getSimpleName());
        }
    }
}

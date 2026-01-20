package com.company.builder;

public class Main {

    public static void main(String[] args) {

        // Create VW factory
        Director vw = new VWDirector();

        // Create VW Golf
        Builder golfBuilder = new GolfBuilder();
        vw.build(golfBuilder);
        System.out.println(golfBuilder.getCar());

        // Create VW Passat
        Builder passatBuilder = new PassatBuilder();
        vw.build(passatBuilder);
        System.out.println(passatBuilder.getCar());
    }
}

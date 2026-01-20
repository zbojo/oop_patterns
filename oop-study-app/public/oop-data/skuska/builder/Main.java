package com.company.skuska.builder;

public class Main {

    public static void main(String[] args) {

        PostavaDirector postavaDirector = new PostavaDirector();


        SedliakBuilder sedliakBuilder = new SedliakBuilder();
        postavaDirector.build(sedliakBuilder);
        System.out.println(sedliakBuilder.getPostava().toString());


        BojovnikBuilder bojovnikBuilder = new BojovnikBuilder();
        postavaDirector.build(bojovnikBuilder);
        System.out.println(bojovnikBuilder.getPostava());

    }
}

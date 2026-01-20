package com.company.singleton_demo;



public  class Singleton {
    private static final Singleton singleton = new Singleton();

    private String data;
    private Singleton(){

    }

    public static Singleton getUniqueInstance(){
        return singleton;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

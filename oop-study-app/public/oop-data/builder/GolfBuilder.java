package com.company.builder;

public class GolfBuilder implements Builder {

    private Golf golf;

    public GolfBuilder() {
        this.golf = new Golf();
    }

    @Override
    public void createChassis() {
        this.golf.setChassis("sport chassis");
    }

    @Override
    public void createEngine() {
        this.golf.setEngine("GTI");
    }

    @Override
    public void createBody() {
        this.golf.setBody("black");
    }

    @Override
    public Car getCar() {
        return this.golf;
    }
}

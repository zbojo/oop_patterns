package com.company.builder;

public class PassatBuilder implements Builder {

    private Passat passat;

    public PassatBuilder() {
        this.passat = new Passat();
    }

    @Override
    public void createChassis() {
        this.passat.setChassis("standard chassis");
    }

    @Override
    public void createEngine() {
        this.passat.setEngine("TDI");
    }

    @Override
    public void createBody() {
        this.passat.setBody("silver");
    }

    @Override
    public Car getCar() {
        return this.passat;
    }
}

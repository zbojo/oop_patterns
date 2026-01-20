package com.company.builder;

public class Car {

    private String chassis;
    private String engine;
    private String body;

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return getClass().getName() + ": " + this.chassis + ", " + this.engine + ", " + this.body;
    }
}

package com.company.builder;

public interface Builder {

    void createChassis();

    void createEngine();

    void createBody();

    Car getCar();
}

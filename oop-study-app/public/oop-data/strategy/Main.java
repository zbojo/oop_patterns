package com.company.strategy;

public class Main {

    public static void main(String[] args) {

        // Create robot
        Robot robot = new Robot();

        // Setup robot to use a tool and do some work with robot
        robot.setTool(new Screwdriver());
        robot.work();

        robot.setTool(new Wrench());
        robot.work();
    }

}

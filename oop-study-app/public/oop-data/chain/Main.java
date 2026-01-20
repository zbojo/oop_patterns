package com.company.chain;

public class Main {

    public static void main(String[] args) {
        Building building = new Building(new Window(new Door(null)));

        building.handle(Event.LIGHTS_ON);
        building.handle(Event.WINDOW_OPENED);
        building.handle(Event.DOOR_OPENED);
    }
}

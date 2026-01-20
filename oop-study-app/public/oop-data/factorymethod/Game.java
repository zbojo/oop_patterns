package com.company.factorymethod;

public class Game {

    public void play() {
        Level level = createLevel();
        level.initialize();
        System.out.println("Playing...");
    }

    public Level createLevel() {
        return new Level();
    }
}

package com.company.factorymethod;

public class AdvancedGame extends Game {

    @Override
    public Level createLevel() {
        return new AdvancedLevel();
    }
}

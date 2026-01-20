package com.company.facade;

public class Main {

    public static void main(String[] args) {

        // Play complex game using simple interface (facade)
        GameFacade game = new GameFacade();
        game.doQuest();
    }
}

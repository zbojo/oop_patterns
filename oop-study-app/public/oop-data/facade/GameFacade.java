package com.company.facade;

public class GameFacade {

    private Player player;
    private Dragon dragon;
    private Princess princess;

    public GameFacade() {
        this.player = new Player();
        this.dragon = new Dragon();
        this.princess = new Princess();
    }

    public void doQuest() {
        player.wander();
        dragon.kill();
        princess.marry();
    }
}

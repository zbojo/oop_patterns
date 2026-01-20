package com.company.chain;

public class Building extends Handler {

    public Building (Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Event e) {
        if (e == Event.LIGHTS_ON)
            System.out.println("Switch off all lights.");
        else if (getSuccessor() != null)
            getSuccessor().handle(e);
        else
            System.out.println("End of chain.");
    }
}

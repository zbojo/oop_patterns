package com.company.chain;

public class Door extends Handler {

    public Door(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Event e) {
        if (e == Event.DOOR_OPENED)
            System.out.println("Close the door.");
        else if (getSuccessor() != null)
            getSuccessor().handle(e);
        else
            System.out.println("End of chain.");
    }
}

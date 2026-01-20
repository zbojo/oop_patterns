package com.company.chain;

public class Window extends Handler {

    public Window(Handler successor) {
        super(successor);
    }

    @Override
    public void handle(Event e) {
        if (e == Event.WINDOW_OPENED)
            System.out.println("Close the window.");
        else if (getSuccessor() != null)
            getSuccessor().handle(e);
        else
            System.out.println("End of chain.");
    }
}

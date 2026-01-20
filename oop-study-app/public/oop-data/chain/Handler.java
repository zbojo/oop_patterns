package com.company.chain;

public abstract class Handler {

    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public Handler getSuccessor() {
        return this.successor;
    }

    public abstract void handle(Event e);

}

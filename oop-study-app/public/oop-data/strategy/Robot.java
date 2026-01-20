package com.company.strategy;

public class Robot {

    private Strategy tool;

    public Robot() {
        this.tool = null;
    }

    public void setTool(Strategy tool) {
        this.tool = tool;
    }

    public void work() {
        if (this.tool == null)
            System.out.println("Robot haven't got any tool.");
        else
            this.tool.execute();
    }

}

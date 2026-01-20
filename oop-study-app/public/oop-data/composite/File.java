package com.company.composite;

import java.util.List;

public class File implements Node {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(Node node) {
        // Do nothing (transparent implementation)
    }

    @Override
    public void remove(Node node) {
        // Do nothing (transparent implementation)
    }

    @Override
    public List<Node> getChildren() {
        // Do nothing (transparent implementation)
        return null;
    }

    @Override
    public void list() {
        System.out.println(this.name);
    }
}

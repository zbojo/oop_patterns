package com.company.composite;

import java.util.LinkedList;
import java.util.List;

public class Directory implements Node {

    private String name;
    private List<Node> nodes;

    public Directory(String name) {
        this.name = name;
        this.nodes = new LinkedList<>();
    }

    @Override
    public void add(Node node) {
        this.nodes.add(node);
    }

    @Override
    public void remove(Node node) {
        this.nodes.remove(node);
    }

    @Override
    public List<Node> getChildren() {
        return this.nodes;
    }

    @Override
    public void list() {
        System.out.println(this.name);
        for (Node node : this.nodes) {
            node.list();
        }
    }
}

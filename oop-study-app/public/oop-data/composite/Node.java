package com.company.composite;

import java.util.List;

public interface Node {

    void add(Node node);
    void remove(Node node);
    List<Node> getChildren();
    void list();
}

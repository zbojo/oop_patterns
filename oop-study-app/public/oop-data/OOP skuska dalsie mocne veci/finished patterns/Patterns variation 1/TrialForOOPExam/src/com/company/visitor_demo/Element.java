package com.company.visitor_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public interface Element {
    void accept(Visitor visitor);
}

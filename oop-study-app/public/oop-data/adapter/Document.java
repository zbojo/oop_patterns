package com.company.adapter;

public class Document {

    private String name;
    private String data;

    public Document(String name, String data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.data;
    }
}

package com.company.builder_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Director {
    private Builder postava;

    public Director(Builder name){
        this.postava = name;
    }

    public void zlozPostavu(){
        postava.createPostava();
        postava.nastavOblecenie();
        postava.nastavZbran();
        postava.nastavSpravanie();
    }

    public Postava vratPostavu(){
        return postava.getPostava();
    }
}

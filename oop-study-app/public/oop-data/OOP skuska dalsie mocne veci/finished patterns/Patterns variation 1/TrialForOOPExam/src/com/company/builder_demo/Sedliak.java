package com.company.builder_demo;


/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Sedliak implements Builder{
    private Postava postava;

    @Override
    public void createPostava(){
        postava = new Postava("sedliak");
    }

    @Override
    public void nastavOblecenie() {
        postava.setOblecenie("platena kosela");
    }

    @Override
    public void nastavZbran() {
        postava.setZbran("motyka");
    }

    @Override
    public void nastavSpravanie() {
        postava.setSpravanie("utekaj");
    }

    @Override
    public Postava getPostava() {
        return postava;
    }
}

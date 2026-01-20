package com.company.builder_demo;

/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Bojovnik implements Builder {
    private Postava bojovnik;

    @Override
    public void createPostava(){
        bojovnik = new Postava("bojovnik");
    }

    @Override
    public void nastavOblecenie(){
        bojovnik.setOblecenie("kruzkova kosela");
    }

    @Override
    public void nastavZbran(){
        bojovnik.setZbran("mec");
    }

    @Override
    public void nastavSpravanie(){
        bojovnik.setSpravanie("bojuj");
    }

    @Override
    public Postava getPostava(){
        return bojovnik;
    }

}

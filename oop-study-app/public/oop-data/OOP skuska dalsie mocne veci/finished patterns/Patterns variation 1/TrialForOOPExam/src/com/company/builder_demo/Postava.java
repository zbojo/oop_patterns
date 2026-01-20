package com.company.builder_demo;


/**
 * Created by Marián Desktop on 01.01.2017.
 */
public class Postava{
    private String oblecenie;
    private String zbran;
    private String spravanie;
    private String name;

    public Postava(String name){
        this.name = name;
    }

    public void setOblecenie(String oblecenie){
        this.oblecenie = oblecenie;
    }

    public void setZbran(String zbran){
        this.zbran = zbran;
    }

    public void setSpravanie(String spravanie){
        this.spravanie = spravanie;
    }

    public String getOblecenie(){
        return this.oblecenie;
    }

    public String getZbran(){
        return this.zbran;
    }

    public String getSpravanie(){
        return this.spravanie;
    }

    public void OpisSa(){
        System.out.println("Som postava:" + this.name);
        System.out.println(this.getOblecenie());
        System.out.println(this.getZbran());
        System.out.println(this.getSpravanie());
    }
}

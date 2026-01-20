/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naskuskubuilder;

/**
 *
 * @author Stevo
 */
public class Postava {

    private String oblecenie;
    private String zbran;
    private String spravanie;

    public void setOblecenie(String data) {
        this.oblecenie = data;
    }

    public void setZbran(String data) {
        this.zbran = data;
    }

    public void setSpravanie(String data) {
        this.spravanie = data;
    }

    public String getOblecenie() {
        return this.oblecenie;
    }

    public String getZbran() {
        return this.zbran;
    }

    public String getSpravanie() {
        return this.spravanie;
    }
    
    public void Popis(){
        System.out.println("Ahoj, ja som postava, ktora ma:");
        System.out.println(this.getOblecenie());
        System.out.println(this.getZbran());
        System.out.println(this.getSpravanie());
    }
}

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
public class Chatrc implements Builder {
private Postava postava;
    
    @Override
    public void create() {
        postava=new Postava();
    }

    @Override
    public void nastavOblecenie() {
       postava.setOblecenie("Platenna kosela");
    }

    @Override
    public void nastavZbran() {
       postava.setZbran("Motyka");
    }

    @Override
    public void nastavSpravanie() {
       postava.setSpravanie("Utekaj...");
    }

    @Override
    public Postava getPostava() {
        return postava;
    }
    
}

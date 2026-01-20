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
public class Hrad implements Builder{
    private Postava postava;
    
    @Override
    public void create() {
        postava=new Postava();
    }

    @Override
    public void nastavOblecenie() {
       postava.setOblecenie("Kruzkova kosela");
    }

    @Override
    public void nastavZbran() {
       postava.setZbran("Mec");
    }

    @Override
    public void nastavSpravanie() {
       postava.setSpravanie("Bojuj...");
    }

    @Override
    public Postava getPostava() {
        return postava;
    }
}

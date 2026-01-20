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
public class Director {
    private Builder budova;
    
    public Director(Builder data){
    budova=data;
    }
    
    public void VytvorPostavu(){
    budova.create();
    budova.nastavOblecenie();
    budova.nastavZbran();
    budova.nastavSpravanie();
    }
    
    public Postava getPostava(){
        return budova.getPostava();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderproject;

/**
 *
 * @author Stevo
 */
public class Recept {

    private String surovina1;
    private String surovina2;
    private int mnozstvo1;
    private int mnozstvo2;

    public void setSurovina1(String surovina1) {
        this.surovina1 = surovina1;
    }

    public void setSurovina2(String surovina1) {
        this.surovina2 = surovina1;
    }

    public void setMnozstvo1(int mnozstvo1) {
        this.mnozstvo1 = mnozstvo1;
    }

    public void setMnozstvo2(int mnozstvo2) {
        this.mnozstvo2 = mnozstvo2;
    }

    public String getSurovina1() {
        return this.surovina1;
    }
    
    public String getSurovina2() {
        return this.surovina2;
    }
    
    public int getMnozstvo1() {
        return this.mnozstvo1;
    }
    
    public int getMnozstvo2() {
        return this.mnozstvo2;
    }
    
    public void TlacRecept(){
        System.out.println("Ahojte, tak v tomto recepte potrebujete: ");
        System.out.println(this.surovina1 + this.mnozstvo1);
        System.out.println(this.surovina2 + this.mnozstvo2);
    }
    
}

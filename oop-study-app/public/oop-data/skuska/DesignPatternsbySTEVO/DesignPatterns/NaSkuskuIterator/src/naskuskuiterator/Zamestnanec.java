/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package naskuskuiterator;

/**
 *
 * @author Stevo
 */
public class Zamestnanec {
    private String meno;
    private String priezvisko;
    private int plat;
    
    public Zamestnanec(String newName, String newPriezvisko, int newPlat){
        this.meno=newName;
        this.priezvisko=newPriezvisko;
        this.plat=newPlat;
    }
    
    public String getMeno(){
    return this.meno;
    }
    
    public String getPriezvisko(){
    return this.priezvisko;
    }
    
    public int getPlat(){
    return this.plat;
    }
}

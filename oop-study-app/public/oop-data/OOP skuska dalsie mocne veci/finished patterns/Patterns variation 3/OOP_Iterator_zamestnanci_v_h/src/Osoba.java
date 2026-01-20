/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class Osoba {
    private String meno,priezvisko;
    private int plat;
    
    public Osoba(String meno,String priezvisko,int plat){
        this.meno=meno;
        this.plat=plat;
        this.priezvisko=priezvisko;
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

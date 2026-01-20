/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class Hrdina {
    private Strategy aktualneSpravanie;
    private String meno;
    public Hrdina(String meno){
        this.meno=meno;
    }
    public void setStrategy(Strategy strategy){
        this.aktualneSpravanie=strategy;
    }
    public void request(){
        System.out.println(meno);
        aktualneSpravanie.spravanie();
        
    }
    
}

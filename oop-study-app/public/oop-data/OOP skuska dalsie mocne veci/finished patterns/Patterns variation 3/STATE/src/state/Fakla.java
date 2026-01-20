/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author ondrej
 */
public class Fakla {
    
    private boolean zatiahnuta;
    private final RiadiaciPanel panel;
    private final Dvere dvere;
    
    public Fakla(RiadiaciPanel panel, Dvere dvere){
        this.panel = panel;
        this.dvere = dvere;
        zatiahnuta = false;
        
    }
    
    public boolean jeZatiahnuta(){
        return zatiahnuta;
    }
    
    public void vrat(){
        zatiahnuta = false;
    }
    
    public void zatiahni(){
        zatiahnuta = true;
        if(!dvere.isOpened()){
            panel.setState("pristupny");
        System.out.println("Uz vidis panel a co teraz ???");}
        else {
            vrat();
        }
    }
    
}

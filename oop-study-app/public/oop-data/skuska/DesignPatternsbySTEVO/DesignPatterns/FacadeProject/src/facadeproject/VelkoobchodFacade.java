/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facadeproject;

/**
 *
 * @author Stevo
 */
//Facade
public class VelkoobchodFacade {
    private Obchod obchod;
    private Sklad sklad;
    
    public VelkoobchodFacade(){
        System.out.println("Vitajte v nasej firme...");
        obchod=new Obchod();
        sklad=new Sklad();
    }
    
    public int ZakolkoKupimVsetkoVsklade(){
    obchod.pisSpracujObjednavku();
    return obchod.zistiCenu(sklad.getMnozstvo());
    }
    
    public void donesOvocie(){
    sklad.odovzdajOvocie();
        System.out.println("Nech sa paci...");
    }
    
    public void ulozOvocie(String ake){
        sklad.skladujOvocie(ake);
    }
    
    public void kolkoJeOvocia(){
        System.out.println("Ovocia je "+sklad.getMnozstvo());
    }
}

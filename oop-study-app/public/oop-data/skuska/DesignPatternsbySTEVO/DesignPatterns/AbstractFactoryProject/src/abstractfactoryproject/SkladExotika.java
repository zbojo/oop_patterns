/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractfactoryproject;

/**
 *
 * @author Stevo
 */
public class SkladExotika extends Dodavatel {

    @Override
    public Ovocie dodajOvocie(String name) {
       switch(name){
           case "Figa": return new Figa();
       } 
       return null;
    }

    @Override
    public Zelenina dodajZelenina(String name) {
        switch(name){
           case "Arasid": return new Arasid();
       } 
       return null;
    }
    
}

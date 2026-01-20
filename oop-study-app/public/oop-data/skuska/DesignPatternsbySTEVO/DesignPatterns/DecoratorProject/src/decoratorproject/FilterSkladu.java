/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package decoratorproject;

/**
 *
 * @author Stevo
 */

//Decorator
public abstract class FilterSkladu implements Dodavatel{
protected Dodavatel pestovatel;

@Override
    public void DodajSuroviny() {
        pestovatel.DodajSuroviny();
        MojaSluzba();
    }

    public void MojaSluzba(){
        
    }
    
}

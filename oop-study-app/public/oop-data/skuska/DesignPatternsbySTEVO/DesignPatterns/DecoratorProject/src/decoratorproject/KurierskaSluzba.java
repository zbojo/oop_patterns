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
public class KurierskaSluzba extends FilterSkladu{
    public KurierskaSluzba(Dodavatel newPestovatel){
    pestovatel=newPestovatel;
    }
    @Override
    public void MojaSluzba(){
        System.out.println("Nech sa paci, tu mate svoju surovinu...");
    }
}

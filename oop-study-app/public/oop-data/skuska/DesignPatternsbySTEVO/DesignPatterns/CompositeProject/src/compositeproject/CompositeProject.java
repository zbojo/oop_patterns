/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compositeproject;

/**
 *
 * @author Stevo
 */
public class CompositeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod
        Dodavatel c1 =new MiskovObchod();
        Dodavatel c2 =new Velkoobchod();
        Dodavatel c3 =new Velkoobchod();
        ((Velkoobchod) c2).pridajSyna(false, c1); // ((Velkoobchod) c2) - toto sa nemoze robit ale je to dosledok SAFE IMPLEMENTATION, kedy klient nema vediet, ktory z Dodavatelov je COMPOSITE
        ((Velkoobchod) c2).pridajSyna(true, c3);// ((Velkoobchod) c2) - toto sa nemoze robit ale je to dosledok SAFE IMPLEMENTATION, kedy klient nema vediet, ktory z Dodavatelov je COMPOSITE
        ((Velkoobchod) c3).pridajSyna(true, c1);// ((Velkoobchod) c2) - toto sa nemoze robit ale je to dosledok SAFE IMPLEMENTATION, kedy klient nema vediet, ktory z Dodavatelov je COMPOSITE
        ((Velkoobchod) c3).pridajSyna(false, c1);// ((Velkoobchod) c2) - toto sa nemoze robit ale je to dosledok SAFE IMPLEMENTATION, kedy klient nema vediet, ktory z Dodavatelov je COMPOSITE
        System.out.println(c2.ZistiTrzby());
    }
    
}

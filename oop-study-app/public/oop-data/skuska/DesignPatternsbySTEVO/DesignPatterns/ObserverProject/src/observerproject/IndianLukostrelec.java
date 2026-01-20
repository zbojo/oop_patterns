/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerproject;

/**
 *
 * @author Stevo
 */
public class IndianLukostrelec implements Observer {
private Vodca mojNacelnik;
    public IndianLukostrelec(Vodca vdc) {
        mojNacelnik=vdc;
        vdc.pridajDoKmena(this);
    }

    @Override
    public void update(String code) {
        switch(code){
            case "porada": System.out.println("Indian s lukom prichadza na poradu..."); break;
            case "damaged": 
                System.out.println("Indian s lukom prichadza na pomoc nacelnikovi, ktory bol zraneny..."); 
                if(mojNacelnik.getDamaged()>10) System.out.println("A tentokrat je nastvany, lebo to nie je len hocijake zranenie!"); 
                break;
        }
    }

}

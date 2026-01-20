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
public class IndianSTomahavkom implements Observer{
    private Vodca mojNacelnik;
    public IndianSTomahavkom(Vodca vdc) {
        mojNacelnik=vdc;
        vdc.pridajDoKmena(this);
    }

    @Override
    public void update(String code) {
        switch(code){
            case "porada": System.out.println("Indian s tomahavkom prichadza na poradu..."); break;
            case "damaged": 
                System.out.println("Indian s tomahavkom prichadza na pomoc nacelnikovi, ktory bol zraneny..."); 
                if(mojNacelnik.getDamaged()>10) System.out.println("A zacina liecit nacelnika, lebo je vazne zraneny!"); 
                break;
        }
    }
}

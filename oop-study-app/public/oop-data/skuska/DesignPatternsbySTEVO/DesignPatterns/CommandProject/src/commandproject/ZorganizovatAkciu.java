/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commandproject;

/**
 *
 * @author Stevo
 */
public class ZorganizovatAkciu implements Objednavka{

    private SkladPresentation sklad;

    public ZorganizovatAkciu(Velkoobchod vo) {
        sklad = new SkladPresentation();
        vo.prijemObjednavky(this);
    }
    
    @Override
    public void execute() {
        sklad.prezentuj();
    }
    
}

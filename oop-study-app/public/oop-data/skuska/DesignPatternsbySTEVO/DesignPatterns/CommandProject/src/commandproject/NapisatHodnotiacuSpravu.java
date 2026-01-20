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
//Concrete Command
public class NapisatHodnotiacuSpravu implements Objednavka {

    private SkladMisko sklad;

    public NapisatHodnotiacuSpravu(Velkoobchod vo) {
        sklad = new SkladMisko();
        vo.prijemObjednavky(this);
    }

    @Override
    public void execute() {
        sklad.pisatHS();
    }

}

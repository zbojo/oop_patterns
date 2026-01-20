/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package builderproject;

/**
 *
 * @author Stevo
 */
public class DrOetker implements VyrobcaReceptov {
private Recept HotovyRecept;
    @Override
    public void PisRecept() {
        HotovyRecept=new Recept();
        
    }

    @Override
    public Recept getRecept() {
        return HotovyRecept;
    }

    @Override
    public void nastavSurovinu1() {
        HotovyRecept.setSurovina1("Zemiaky");
    }

    @Override
    public void nastavSurovinu2() {
        HotovyRecept.setSurovina2("Maso");
    }

    @Override
    public void nastavMnozstvo1() {
        HotovyRecept.setMnozstvo1(100);
    }

    @Override
    public void nastavMnozstvo2() {
        HotovyRecept.setMnozstvo2(3);
    }
    
}

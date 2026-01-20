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
class Juno implements VyrobcaReceptov {
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
        HotovyRecept.setSurovina1("Muka");
    }

    @Override
    public void nastavSurovinu2() {
        HotovyRecept.setSurovina2("Mlieko");
    }

    @Override
    public void nastavMnozstvo1() {
        HotovyRecept.setMnozstvo1(2);
    }

    @Override
    public void nastavMnozstvo2() {
        HotovyRecept.setMnozstvo2(2);
    }
    
}

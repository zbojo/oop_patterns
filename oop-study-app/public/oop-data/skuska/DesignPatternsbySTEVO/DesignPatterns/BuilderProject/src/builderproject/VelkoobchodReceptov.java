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
public class VelkoobchodReceptov {

    private VyrobcaReceptov vyrobcareceptov;

    public VelkoobchodReceptov(VyrobcaReceptov Konkretnyvyrobcareceptov) {
        vyrobcareceptov = Konkretnyvyrobcareceptov;
    }

    public void VytvorRecept() {
        vyrobcareceptov.PisRecept();
        vyrobcareceptov.nastavSurovinu1();
        vyrobcareceptov.nastavSurovinu2();
        vyrobcareceptov.nastavMnozstvo1();
        vyrobcareceptov.nastavMnozstvo2();
    }

    public Recept OdovzdajRecept() {
        return vyrobcareceptov.getRecept();
    }
    
    public void setVyrobcaReceptov(VyrobcaReceptov vr){
    this.vyrobcareceptov =vr;
    }
}

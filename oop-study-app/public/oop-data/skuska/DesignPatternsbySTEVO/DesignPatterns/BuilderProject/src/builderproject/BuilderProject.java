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
public class BuilderProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod
        VyrobcaReceptov PodnikDO = new DrOetker();
        VyrobcaReceptov PekarenJUNO = new Juno();
        VelkoobchodReceptov Director = new VelkoobchodReceptov(PodnikDO);
        Director.VytvorRecept();
        Director.OdovzdajRecept().TlacRecept();
        Director.setVyrobcaReceptov(PekarenJUNO);
        Director.VytvorRecept();
        Director.OdovzdajRecept().TlacRecept();
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterproject;

/**
 *
 * @author Stevo
 */
public class AdapterProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // maloobchod

        RozhradnieVelkoobchodu webstrankaVelkoobchodu = new VelkoobchodOvocie(new PestovatelMisko());
        System.out.println(webstrankaVelkoobchodu.KolkoHrusiek());
        System.out.println(webstrankaVelkoobchodu.KolkoJablk());
    }

}

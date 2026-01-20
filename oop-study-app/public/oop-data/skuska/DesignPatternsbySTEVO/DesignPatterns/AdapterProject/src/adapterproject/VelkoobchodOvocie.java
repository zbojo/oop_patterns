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
public class VelkoobchodOvocie implements RozhradnieVelkoobchodu {

    private PestovatelMisko adaptee;

    public VelkoobchodOvocie(PestovatelMisko pest) {
        this.adaptee = pest;
    }

    @Override
    public int KolkoHrusiek() {
        return adaptee.getMnozstvoHrusky();
    }

    @Override
    public int KolkoJablk() {
        return adaptee.getMnozstvoJablka();
    }

}

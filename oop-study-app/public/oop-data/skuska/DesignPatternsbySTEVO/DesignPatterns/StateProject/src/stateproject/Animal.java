/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stateproject;

/**
 *
 * @author Stevo
 */
public class Animal {

    private State state;

    public Animal() {
        this.state = new Lucky();
    }

    public void spravajSa() {
        this.state.handle();
    }

    public void setState(State st) {
        this.state = st;
    }

    public void nastvi() {
        this.state = new Angry();
    }

    public void uspi() {
        this.state = new Sleeping();
    }

}

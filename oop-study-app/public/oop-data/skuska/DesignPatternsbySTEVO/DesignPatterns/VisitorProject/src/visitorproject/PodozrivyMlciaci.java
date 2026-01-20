/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitorproject;

import java.util.Random;

/**
 *
 * @author Stevo
 */
public class PodozrivyMlciaci implements Podozrivy{
    
    private String name;
    private boolean guilty;
    Random generator = new Random();

    public PodozrivyMlciaci(String newString) {
        this.name = newString;
        this.guilty = generator.nextBoolean();
    }
    
    public boolean Prehladat(){
    return guilty;
    }

    @Override
    public void accept(Visitor v) {
        v.Visit(this);
    }
}

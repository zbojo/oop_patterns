/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESKOPC
 */
public class AnimalGang implements Animal{
    
    int i=0;
    private List<Animal> animalList = new ArrayList<>();
    
    

    @Override
    public void makeSound() {
        while(animalList.get(i) instanceof Animal){
            Animal x=(Animal) animalList.get(i);
            x.makeSound();
            i++;
    }
    }
    
    
    public void add(Animal anim)
    {
        this.animalList.add(anim);
    }
    
    public void remove(Animal anim)
    {
        this.animalList.remove(anim);
    }
    
}

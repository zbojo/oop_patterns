/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    public static void main(String[] argv)
    {
        Dog dog = new Dog();
        Cow cow = new Cow();
        AnimalGang animalGang = new AnimalGang();
        animalGang.add(cow);
        animalGang.add(cow);
        animalGang.add(cow);
        animalGang.add(dog);
        animalGang.add(dog);
        
        animalGang.makeSound();
    }
    
}

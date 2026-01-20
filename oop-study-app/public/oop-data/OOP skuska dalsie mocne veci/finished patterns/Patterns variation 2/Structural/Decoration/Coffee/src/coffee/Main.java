/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    public static void main(String[] argv)
    {
        Coffee c = new SimpleCoffee(); //vytvori len kavu
        System.out.println("Cena: " + c.getCost() + ", Ingrediencie: " + c.getIngredients());
        
        c = new Milk(c); //prida mlieko
        System.out.println("Cena: " + c.getCost() + ", Ingrediencie: " + c.getIngredients());
        
        c = new Whip(c); //prida slahacku
        System.out.println("Cena: " + c.getCost() + ", Ingrediencie: " + c.getIngredients());
        
        c = new Sprinkles(c); //prida ozdoby
        System.out.println("Cena: " + c.getCost() + ", Ingrediencie: " + c.getIngredients());
        
        System.out.println("----------------------------------");
        
        //alebo sa to da vyskadat naraz
        Coffee allCoffee = new Milk(new Whip(new Sprinkles(new SimpleCoffee())));
        System.out.println("Cena: "  + allCoffee.getCost() + ", Ingrediencie: " + allCoffee.getIngredients());
    }
    
}

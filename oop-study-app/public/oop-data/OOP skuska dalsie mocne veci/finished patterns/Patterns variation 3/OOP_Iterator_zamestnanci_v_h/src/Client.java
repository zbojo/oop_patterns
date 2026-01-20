/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viktorooo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConcreteAggregate zoznam = new ConcreteAggregate();
        zoznam.pridajOsobu(new Osoba("Jozef", "Hruska", 100));
        zoznam.pridajOsobu(new Osoba("Peter", "Maly", 200));
        zoznam.pridajOsobu(new Osoba("Stefan", "Tucny", 500));
        
        Iterator iterator=zoznam.createIterator();
        
        //dalo sa jednoduchsie cyklom
        
        //pretypovanie ??? 
        System.out.println(iterator.first().getMeno()+iterator.first().getPriezvisko()+iterator.first().getPlat());
        System.out.println(iterator.next().getMeno()+iterator.currentItem().getPriezvisko()+iterator.currentItem().getPlat());
        System.out.println(iterator.next().getMeno()+iterator.currentItem().getPriezvisko()+iterator.currentItem().getPlat());

    }
    
}

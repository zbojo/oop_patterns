/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    
    public static void main(String[] args)
    {
        //vytvorenie presonov
        Person p1 = new Person(21, "Jan");
        Person p2 = new Person(20, "Patrik");
        Person p3 = new Person(14, "Dominik");
        Person p4 = new Person(45, "Monika");
        
        //pridanie presonov do zoznamu
        PersonCollection pc = new PersonCollection();
        pc.add(p4);
        pc.add(p3);
        pc.add(p2);
        pc.add(p1);
        
        //vypis personov prechodom zoznamu cez Iterator
        Iterator iterator = pc.Iterator();
        while(iterator.hasNext())
        {
            Person p = iterator.getNext();
            System.out.println("Meno: " + p.getName() + ", Vek: " + p.getAge());
        }
        
        Person p = iterator.First();
        System.out.println("Prvy je: " + p.getName() + "("+p.getAge()+")");
        p = iterator.Last();
        System.out.println("Posledny je: " + p.getName() + "("+p.getAge()+")");
        
    }
    
}

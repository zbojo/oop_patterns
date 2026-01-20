/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package director;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    
    public static void main(String[] argv)
    {
        Director director = new Director();
        ConcreteBuilder1 cb1 = new ConcreteBuilder1();
        ConcreteBuilder2 cb2 = new ConcreteBuilder2();
        
        director.construct(cb1);
        director.construct(cb2);
        System.out.println(cb1.getResult().getOblecenie());
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic;

/**
 *
 * @author ESKOPC
 */
public class Main {
    
    public static void main(String[] argv)
    {
        Elipse el1 = new Elipse();
        Elipse el2 = new Elipse();
        Elipse el3 = new Elipse();
        Elipse el4 = new Elipse();
        
        CompositeGraphic comp1 = new CompositeGraphic();
        CompositeGraphic comp2 = new CompositeGraphic();
        CompositeGraphic comp3 = new CompositeGraphic();
        
        comp2.add(el1);
        comp2.add(el2);
        comp2.add(el3);
        
        comp3.add(el4);
        
        comp1.add(comp2);
        comp1.add(comp3);
        
        comp1.print();
        
        
    }
    
}

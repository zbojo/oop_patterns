/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author ESKOPC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException{
        PrototypeImp prototype = new PrototypeImp(1000);
        prototype.setX(29);
        prototype.printX();
        
        PrototypeImp prototype1 = prototype.clone();
        prototype1.printX();
        
    /*    for(int y = 1; y < 5; y++)
        {
            Prototype temp = prototype.clone();
            temp.setX(temp.getX()*y);
            temp.printX();
        }
      */ 
         
        
    }
}

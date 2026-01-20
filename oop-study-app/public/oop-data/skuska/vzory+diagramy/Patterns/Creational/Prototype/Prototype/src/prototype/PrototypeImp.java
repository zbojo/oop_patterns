/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author ESKOPC
 */
public class PrototypeImp implements Prototype, Cloneable{
    private int x;
    
    public PrototypeImp(int x)
    {
        setX(x);
    }

    @Override
    public void printX() {
        System.out.println("Value x is: " + x);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return x;
    }
    
    @Override
    public PrototypeImp clone() throws CloneNotSupportedException{
        
        return (PrototypeImp) super.clone();
    }
    
}

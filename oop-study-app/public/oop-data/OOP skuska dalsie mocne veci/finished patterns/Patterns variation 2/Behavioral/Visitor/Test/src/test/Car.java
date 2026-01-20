/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ESKOPC
 */
public class Car implements CarElement{
    
    private CarElement[] carList;
    
    public Car()
    {
        this.carList = new CarElement[]{new Wheel("FRONT LEFT"), new Wheel("FRONT RIGHT"), new Wheel("BACK LEFT"), new Wheel("BACK LEFT"), new Engine(), new Body()};
    }
    

    @Override
    public void accept(CarElementVisitor visitor) {
        for(CarElement c:carList)
        {
            c.accept(visitor);            
        }
        visitor.visit(this);
    }

    
   
    
}

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
        AbstractFactory a=new ConcreteFactory1();
        AbstractFactory b=new ConcreteFactory2();
        
        a.createProductA();
        a.createProductB();
        b.createProductA();
        b.createProductB();
        
    }
    
}

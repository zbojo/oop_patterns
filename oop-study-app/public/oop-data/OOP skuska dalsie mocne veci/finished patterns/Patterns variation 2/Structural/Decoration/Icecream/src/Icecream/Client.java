/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Icecream;

/**
 *
 * @author ESKOPC
 */
public class Client {
    
    public static void main(String[] args)
    {
        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
        // icecream.makeIcecream();  //vrati string ale potrebne je ho vypisat a preto
        System.out.println(icecream.makeIcecream());
        
    }
    
}

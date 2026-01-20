/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_singleton_v_h;

/**
 *
 * @author viktorooo
 */
public class OOP_Singleton_v_h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton singlpointer1 = Singleton.getInstance();
        singlpointer1.setData(1);
        System.out.println("data of Singleton: "+ singlpointer1.getData());
        
        Singleton singlpointer2 = Singleton.getInstance();
        singlpointer2.setData(2);
        System.out.println("data of Singleton: "+ singlpointer2.getData());
        System.out.println("data of Singleton: "+ singlpointer1.getData());
    }
    
}

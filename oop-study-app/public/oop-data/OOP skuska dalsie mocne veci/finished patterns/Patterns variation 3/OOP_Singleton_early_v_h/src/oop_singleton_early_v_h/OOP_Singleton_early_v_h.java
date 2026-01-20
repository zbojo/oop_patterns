/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_singleton_early_v_h;

/**
 *
 * @author viktorooo
 */
public class OOP_Singleton_early_v_h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setData(10);
        System.out.println(s1.getData());
        Singleton s2 = Singleton.getInstance();
        s2.setData(5);
        System.out.println(s2.getData());
        System.out.println(s1.getData());
    }
    
}

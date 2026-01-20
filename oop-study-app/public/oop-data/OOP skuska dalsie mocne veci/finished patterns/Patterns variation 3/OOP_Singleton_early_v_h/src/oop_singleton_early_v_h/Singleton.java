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
public class Singleton {
    private static final Singleton uniqeInstance =new Singleton();
    private int data;
    private Singleton(){}
    
    public static Singleton getInstance(){
        return uniqeInstance;
    }
    
    public void setData(int data){
        this.data=data;
    }
    
    public int getData(){
        return this.data;
    }
}

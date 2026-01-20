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
public class Singleton {
    private static Singleton instance=null;
    private int data;
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
        return this.data;
    }
}

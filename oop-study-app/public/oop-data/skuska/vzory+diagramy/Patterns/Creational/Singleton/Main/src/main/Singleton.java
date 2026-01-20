/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ESKOPC
 */
public class Singleton {
    
    private static Singleton instance = null;
    private int data;
    
    private Singleton(){
        data = 0;
    }
    
    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void setData(int data)
    {
        this.data = data;
    }
    
    public void printData()
    {
        System.out.println("Data = " + data);
    }
    
}

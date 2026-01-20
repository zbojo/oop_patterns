/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singletonproject;

/**
 *
 * @author Stevo
 */
public class Singleton {
    private static Singleton uniqueinstance=null;
    private Singleton(){
    }
    
    public static Singleton getInstance(){
        if(uniqueinstance==null){
            uniqueinstance=new Singleton();
        }
     return uniqueinstance;
    }
    
    public void write(){
    System.out.println("Pisem pisem...");
    }
}

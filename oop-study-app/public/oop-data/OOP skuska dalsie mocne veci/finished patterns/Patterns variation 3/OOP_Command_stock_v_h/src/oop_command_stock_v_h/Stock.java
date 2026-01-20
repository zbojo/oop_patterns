/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_command_stock_v_h;

/**
 *
 * @author viktorooo
 */
public class Stock {
    private String name;
    private int quantity;
    
    public Stock(String name, int quantity){
        this.name=name;
        this.quantity=quantity;
    }
    
    public void buy(){
        System.out.println("Stock: "+ name +" Quantity: "+quantity+" bought");
    }
    public void sell(){
        System.out.println("Stock: "+ name +" Quantity: "+quantity+" sold");
    }
}

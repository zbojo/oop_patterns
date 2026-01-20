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
public class OOP_Command_stock_v_h {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock jablka = new Stock("jablka", 100);
        
        BuyStock buyOrder = new BuyStock(jablka);
        SellStock sellOrder = new SellStock(jablka);
        
        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);
        
        broker.placeOrders();
        
        
        
    }
    
}

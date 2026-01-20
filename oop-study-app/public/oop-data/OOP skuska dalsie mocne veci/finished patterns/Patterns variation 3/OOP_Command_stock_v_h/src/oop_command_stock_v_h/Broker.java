/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_command_stock_v_h;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author viktorooo
 */
public class Broker {
    private List<Order> list = new ArrayList<Order>();
    
    public void takeOrder(Order order){
        list.add(order);
    }
    
    public void placeOrders(){
        for (Order o : list){
            o.execute();
        }
        list.clear();
    }
}

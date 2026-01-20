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
public class BuyStock implements Order{
    private Stock stock;
    
    public BuyStock(Stock stock){
        this.stock=stock;
    }
    

    @Override
    public void execute() {
        stock.buy();
    }
    
}

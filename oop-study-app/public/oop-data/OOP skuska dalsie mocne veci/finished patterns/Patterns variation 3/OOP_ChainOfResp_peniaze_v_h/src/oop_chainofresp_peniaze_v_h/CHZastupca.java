/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_chainofresp_peniaze_v_h;

/**
 *
 * @author viktorooo
 */
public class CHZastupca implements Handler{
    private Handler successor;
    public CHZastupca(Handler successor){
        this.successor=successor;
    }
    
    @Override
    public void handleRequest(int suma) {
        if (suma<1000){
            System.out.println("ZASTUPCA: ja vas vyplatim");
        }
        else {
            System.out.println("ZASTUPCA: ja vas nemozem vyplatit, chodte za riaditelom");
            successor.handleRequest(suma);
        }
    }
}

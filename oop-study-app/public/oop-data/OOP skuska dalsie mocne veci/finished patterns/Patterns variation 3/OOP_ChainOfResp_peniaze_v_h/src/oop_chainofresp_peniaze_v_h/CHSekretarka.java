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
public class CHSekretarka implements Handler {
    private Handler successor;
    public CHSekretarka(Handler successor){
        this.successor=successor;
    }
    
    @Override
    public void handleRequest(int suma) {
        if (suma<200){
            System.out.println("SEKRETARKA: ja vas vyplatim");
        }
        else {
            System.out.println("SEKRETARKA: ja vas nemozem vyplatit, chodte za zastupcom");
            successor.handleRequest(suma);
        }
    }
    
}

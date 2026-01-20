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
public class CHRiaditel implements Handler {
    
    public CHRiaditel(){
        
    }
    
    @Override
    public void handleRequest(int suma) {
        if (suma<5000){
            System.out.println("RIADITEL: vyplatim vas");
        }
        else {
            System.out.println("RIADITEL: ziadate privela, nemozem vam poskytnut tuto ciastku");
        }
    }
}

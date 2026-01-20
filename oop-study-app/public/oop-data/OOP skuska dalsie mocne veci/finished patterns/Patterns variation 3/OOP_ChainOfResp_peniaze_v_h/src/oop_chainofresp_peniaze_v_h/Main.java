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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Handler riaditel = new CHRiaditel();
        Handler zastupca = new CHZastupca(riaditel);
        Handler sekretarka = new CHSekretarka(zastupca);
        sekretarka.handleRequest(4500);
    }
    
}

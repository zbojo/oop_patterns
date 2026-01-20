/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxyproject;

/**
 *
 * @author Stevo
 */
public class ProxyProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FBIwebPage wwwFBIcom=new wwwFBIcom();
        FBIwebPage proxyServer=new ProxyMachine(wwwFBIcom);
        wwwFBIcom.access("Stevo");
        wwwFBIcom.request("pohodka...");
        wwwFBIcom.request("stahujem zo stranky... sa vola ze:");
        wwwFBIcom.request("megaupload");
        
        proxyServer.access("Stevo");
        proxyServer.request("pohodka...");
        proxyServer.request("stahujem zo stranky... sa vola ze:");
        proxyServer.request("megaupload");
    }
    
}

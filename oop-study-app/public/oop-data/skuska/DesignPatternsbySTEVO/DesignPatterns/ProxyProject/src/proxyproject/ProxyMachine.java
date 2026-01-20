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
public class ProxyMachine implements FBIwebPage {

    private FBIwebPage tempPage;

    public ProxyMachine(FBIwebPage newFBIwebPage) {
        tempPage = newFBIwebPage;
    }

    @Override
    public void request(String msg) {
        switch(msg){
            case "hacker": 
            case "megaupload": 
            case "anonymous": 
                tempPage.request("0"+msg+"0");
                break;
            default: tempPage.request(msg);
        }
        
    }

    @Override
    public void access(String name) {
        tempPage.access("No Name");
    }

}

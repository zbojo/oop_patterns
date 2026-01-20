package com.company.proxy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class ProxyMachine implements FBIwebpage {
    private FBIwebpage tempPage;

    public ProxyMachine(FBIwebpage newFBIwebpage) {
        tempPage = newFBIwebpage;
    }

    @Override
    public void access(String name) {
        tempPage.access("No Name");
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
}

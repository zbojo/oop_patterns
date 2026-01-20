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
public class wwwFBIcom implements FBIwebPage {

    private String visitor;

    @Override
    public void access(String userName) {
        this.visitor = userName;
        System.out.println("OK, there is a new user with name: " + visitor);
    }

    public void request(String msg) {
        switch (msg) {
            case "hacker":
            case "megaupload":
            case "anonymous":
                System.out.println("Message: " + msg);
                System.out.println("Oh yeah, there is a hacker here... ");
            default:
                System.out.println("Message: " + msg);
        }

    }

}

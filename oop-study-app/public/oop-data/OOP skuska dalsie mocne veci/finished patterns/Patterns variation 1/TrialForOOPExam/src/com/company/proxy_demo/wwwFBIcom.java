package com.company.proxy_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class wwwFBIcom implements FBIwebpage {
    private String visitor;

    @Override
    public void access(String name) {
        this.visitor = name;
        System.out.println("OK, there is a new user with name: " + visitor);
    }

    @Override
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

package com.company.chainOfResonsibility_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class SkladMisko implements Sklad {

    private Sklad successor;

    public SkladMisko(Sklad succ) {
        this.successor = succ;
    }

    @Override
    public void dodaj(String tovar) {
        System.out.println("SkladMisko:");
        switch (tovar) {
            case "Banan":
                System.out.println("Banan bol dodany...");
                break;
            case "Kivi":
                System.out.println("Kivi bolo dodany...");
                break;
            default:
                if(successor!=null)successor.dodaj(tovar); else System.out.println("Tak take ovocie sme nikde nenasli...");
        }
    }

}
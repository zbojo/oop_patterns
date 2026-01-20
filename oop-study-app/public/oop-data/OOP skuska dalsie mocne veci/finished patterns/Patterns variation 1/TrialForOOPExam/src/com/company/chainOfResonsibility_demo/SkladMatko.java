package com.company.chainOfResonsibility_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class SkladMatko implements Sklad {

    private Sklad successor;

    public SkladMatko(Sklad successor){
        this.successor = successor;
    }

    @Override
    public void dodaj(String tovar) {
        System.out.println("SkladMatko:");
        switch (tovar) {
            case "Slivka":
                System.out.println("Slivka bola dodana...");
                break;
            case "Hruska":
                System.out.println("Hruska bola dodana...");
                break;
            default:
                if(successor!=null)successor.dodaj(tovar); else System.out.println("Tak take ovocie sme nikde nenasli...");
        }
    }
}

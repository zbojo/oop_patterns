package com.company.chainOfResonsibility_demo;

/**
 * Created by Marián Desktop on 02.01.2017.
 */
public class SkladPeter implements Sklad{

    private Sklad successor;

    public SkladPeter(Sklad succ) {
        this.successor = succ;
    }

    @Override
    public void dodaj(String tovar) {
        System.out.println("SkladPeter:");
        switch (tovar) {
            case "Broskyna":
                System.out.println("Broskyna bola dodany...");
                break;
            case "Ceresna":
                System.out.println("Ceresna bola dodana...");
                break;
            default:
                if(successor!=null)successor.dodaj(tovar); else System.out.println("Tak take ovocie sme nikde nenasli...");
        }
    }
}

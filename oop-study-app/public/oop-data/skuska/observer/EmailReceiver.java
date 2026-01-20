package com.company.skuska.observer;

public class EmailReceiver implements MessageReceiver {

    private PressAgency agency;

    public EmailReceiver(PressAgency agency) {
        this.agency = agency;
    }

    @Override
    public void update() {
        System.out.println(String.format("e-mail < %s", agency.getMessage()));

    }
}

package com.company.skuska.observer;

public class SMSReceiver implements MessageReceiver {

    private PressAgency agency;

    public SMSReceiver(PressAgency agency) {
        this.agency = agency;
    }

    @Override
    public void update() {
        System.out.println(String.format("SMS < %s", agency.getMessage()));
    }
}

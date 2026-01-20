package com.company.skuska.observer;

public class Main {

    public static void main(String[] args) {
        PressAgency pressAgency = new PressAgency();

        MessageReceiver emailReceiver = new EmailReceiver(pressAgency);
        MessageReceiver smsReceiver = new SMSReceiver(pressAgency);

        pressAgency.attach(emailReceiver);
        pressAgency.attach(smsReceiver);

        pressAgency.setMessage("helloooo there!");

        pressAgency.detach(smsReceiver);

        pressAgency.setMessage("SKAAAAP");
        pressAgency.setMessage(null);
    }
}

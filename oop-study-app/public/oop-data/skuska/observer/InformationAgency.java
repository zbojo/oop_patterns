package com.company.skuska.observer;

public interface InformationAgency {

    void attach(MessageReceiver messageReceiver);

    void detach(MessageReceiver messageReceiver);

    void notifyReceivers();
}

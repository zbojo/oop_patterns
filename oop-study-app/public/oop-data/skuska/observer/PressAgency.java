package com.company.skuska.observer;

import java.util.HashSet;
import java.util.Set;

public class PressAgency implements InformationAgency {

    private String message;
    private Set<MessageReceiver> messageReceivers;

    public PressAgency() {
        this.messageReceivers = new HashSet<>();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyReceivers();
    }

    @Override
    public void attach(MessageReceiver messageReceiver) {
        messageReceivers.add(messageReceiver);
    }

    @Override
    public void detach(MessageReceiver messageReceiver) {
        messageReceivers.remove(messageReceiver);
    }

    @Override
    public void notifyReceivers() {
        messageReceivers.forEach(MessageReceiver::update);
    }
}

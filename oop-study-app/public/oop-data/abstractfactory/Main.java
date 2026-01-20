package com.company.abstractfactory;

public class Main {

    public static void main(String[] args) {

        // Chat via Messenger
        ConnectionFactory messengerConnectionFactory = new MessengerFactory();

        MultiChat messengerMultiChat = new MultiChat();
        messengerMultiChat.connect(messengerConnectionFactory);
        messengerMultiChat.chat();

        // Chat via WhatsApp
        ConnectionFactory whatsAppConnectionFactory = new WhatsAppFactory();

        MultiChat whatsAppMultiChat = new MultiChat();
        whatsAppMultiChat.connect(whatsAppConnectionFactory);
        whatsAppMultiChat.chat();
    }
}

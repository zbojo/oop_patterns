package com.company.abstractfactory;

public class WhatsAppFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new WhatsApp();
    }
}

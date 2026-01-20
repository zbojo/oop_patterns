package com.company.abstractfactory;

public class MessengerFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        return new Messenger();
    }
}

package com.company.abstractfactory;

public class MultiChat {

    private Connection connection;

    public void connect(ConnectionFactory connectionFactory) {
        this.connection = connectionFactory.createConnection();
    }

    public void chat() {
        System.out.println("Chatting...");
        this.connection.send("Hello");
        String response = this.connection.receive();
    }
}

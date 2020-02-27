package com.iquestgroup.remotelearning;

public class App {
    public static void main(String[] args) {
        ConnectionManager connectionManager = new ConnectionManager();
        ConnectionManager.Connection connection;
        int i = 0;
        while(true) {
            connection = connectionManager.getConnection();
            System.out.println("Connection no. " + connection.getConnectionID() + " has been consumed");

            i++;
        }
    }
}

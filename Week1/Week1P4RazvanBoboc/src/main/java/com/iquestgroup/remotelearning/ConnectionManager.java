package com.iquestgroup.remotelearning;

public class ConnectionManager {
    private int numberOfConnections = 11;
    private Connection[] connectionsArray = new Connection[numberOfConnections];

    public ConnectionManager() {
        createConnections();
    }

    private void createConnections() {
        for (int i = 0; i < numberOfConnections; i++) {
            connectionsArray[i] = new Connection(i);
            System.out.println("Connection no. " + i + " has been established");
        }
    }

    public class Connection {
        private int ConnectionID;

        private Connection(int ConnectionID) {
            this.ConnectionID = ConnectionID;
        }

        public int getConnectionID() {
            return ConnectionID;
        }

    }

    public Connection getConnection(int i) {
        if (i == numberOfConnections) {
            System.out.println("The connection manager has run out of connections");
            return null;
        }
        return connectionsArray[i];
    }

}


package com.iquestgroup.remotelearning;

public class App {
    public void start() {
        Domain domain1 = new Domain("Cauldron", "Dropbox", "192.167.1.1");
        Domain domain2 = new Domain("Sargon", "Google", "198.163.1.2");
        Domain domain3 = new Domain("Ytiks", "Facebook", "195.165.1.3");

        Registry registry = new Registry();
        registry.newEntry(domain1);
        registry.newEntry(domain2);
        registry.newEntry(domain3);
        Customer customer = new Customer("Cauldron", "Amazon", "191.127.1.1");
        Reseller reseller = new Reseller();
        Registrar registrar = new Registrar();
        customer.connectToReseller(reseller);
        reseller.connectToRegistrar(registrar);
        registrar.connectToRegistry(registry);
        registry.printDomains();

    }
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }
}

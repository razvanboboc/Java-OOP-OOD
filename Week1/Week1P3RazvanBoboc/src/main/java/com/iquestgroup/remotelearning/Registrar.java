package com.iquestgroup.remotelearning;

public class Registrar {
    private String[] domainDataFromReseller;
    public void receiveDomainDataFromReseller(String[] domainDataFromReseller) {
        this.domainDataFromReseller = domainDataFromReseller;
    }
    public void connectToRegistry(Registry registry) {

        registry.domainCreation(domainDataFromReseller);
    }

}


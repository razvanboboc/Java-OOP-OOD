package com.iquestgroup.remotelearning;

public class Reseller {
    private String[] domainDataFromCustomer;
    public void receiveDomainDataFromCustomer(String[] domainDataCustomer) {
        this.domainDataFromCustomer = domainDataCustomer;
    }
    public void connectToRegistrar(Registrar registrar) {

        registrar.receiveDomainDataFromReseller(domainDataFromCustomer);

    }

}

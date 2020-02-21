package com.iquestgroup.remotelearning;

public class Customer {
    private static final int maxarraylength = 3;
    private String[] domainData;
    public Customer(String domainName, String owner, String host) {

        domainData = new String[maxarraylength];
        domainData[0] = domainName;
        domainData[1] = owner;
        domainData[2] = host;

    }
    public void connectToReseller(Reseller reseller) {
        reseller.receiveDomainDataFromCustomer(domainData);
    }

}

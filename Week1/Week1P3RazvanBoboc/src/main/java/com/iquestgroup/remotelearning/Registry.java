package com.iquestgroup.remotelearning;

import java.util.HashSet;
import java.util.Set;

public class Registry {
    private Set<Domain> domainsDatabase = new HashSet<Domain>();
    public void domainCreation(String[] domainDataFromRegistrar) {
        boolean condition = true;
        for (Domain domain : domainsDatabase) {
            if (domainDataFromRegistrar[0] == domain.returnName()) {

                System.out.println("This domain name already exists, try again!");
                condition = false;
                break;
            } else if (domainDataFromRegistrar[2] == domain.returnHost()) {

                System.out.println("This host already exists, try again!");
                condition = false;
                break;
            }

        }
        if (condition) {
            System.out.println("Creation succesful! New domain entry: " + domainDataFromRegistrar[0]);
            newEntry(new Domain(domainDataFromRegistrar[0], domainDataFromRegistrar[1], domainDataFromRegistrar[2]));
        }
    }
    public void newEntry(Domain domain) {
        domainsDatabase.add(domain);
    }
    public void printDomains() {
        for (Domain domain : domainsDatabase) {
            System.out.println(domain.print());
        }
    }

}


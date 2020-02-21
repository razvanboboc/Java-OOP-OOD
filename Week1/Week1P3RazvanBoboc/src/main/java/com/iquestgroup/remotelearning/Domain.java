package com.iquestgroup.remotelearning;

public class Domain {
    private String nameOfDomain;
    private String ownership;
    private String host;
    public Domain(String nameOfDomain, String ownership, String host) {
        this.nameOfDomain = nameOfDomain;
        this.ownership = ownership;
        this.host = host;
    }
    public String returnName() {
        return nameOfDomain;
    }

    public String returnOwner() {
        return ownership;
    }

    public String returnHost() {
        return host;
    }
    public void changeName(String name) {
        this.nameOfDomain = name;
    }

    public void changeOwner(String ownership) {
        this.ownership = ownership;
    }

    public void changeHost(String host) {
        this.host = host;
    }

    public String print() {
        return "Domain: " + returnName() + " || Owner: " + returnOwner() + " || Host: " + returnHost();
    }

}


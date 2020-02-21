package com.iquestgroup.remotelearning;


public class Person {
    private String firstName;
    private String surName;
    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    public Person(String fullName) {
        String[] fullNameArray = fullName.split(" ");
        this.firstName = determineFirstName(fullNameArray);
        this.surName = fullNameArray[fullNameArray.length - 1];
    }
    private String determineFirstName(String[] fullNameArray) {
        String[] firstNameArray = new String[fullNameArray.length -1];
        for(int i = 0; i < fullNameArray.length - 1; i++) {
            firstNameArray[i] = fullNameArray[i];
        }
        String firstName = String.join(" ", firstNameArray);
        return firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String showNames () {
        return "Firstname: " + firstName + " Surname: " + surName;
    }

}


package com.iquestgroup.remotelearning;

public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String dateOfDeath;

    public Person(String firstName, String lastName, String dateOfBirth, String dateOfDeath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
    }

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = null;
    }

    public String printPerson() {
        if(dateOfDeath != null) {
            return firstName + " " + lastName + " (" + dateOfBirth + " - " + dateOfDeath + ")";
        }else {
            return firstName + " " + lastName + " " + dateOfBirth;
        }

    }

}


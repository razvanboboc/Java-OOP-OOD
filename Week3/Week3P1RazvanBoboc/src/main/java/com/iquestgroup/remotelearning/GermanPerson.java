package com.iquestgroup.remotelearning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GermanPerson extends Person {

    public GermanPerson(String firstName, String surName, String dateOfBirth) {
        super(firstName, surName);
        LocalDate birthDate = getBirthDate(dateOfBirth);
        setBirthDate(birthDate);
        selfDescribe();
    }

    public GermanPerson(String fullName, String dateOfBirth) {
        super(fullName);
        LocalDate birthDate = getBirthDate(dateOfBirth);
        setBirthDate(birthDate);
        selfDescribe();
    }


    @Override
    public LocalDate getBirthDate(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.parse(dateOfBirth, formatter);
    }

    @Override
    public void selfDescribe() {
        System.out.println("Hallo, meine Name ist " + getFirstName() + " " + getSurName() + " und ich bin " + calculateAge()
                + " Jahre alt");

    }


}

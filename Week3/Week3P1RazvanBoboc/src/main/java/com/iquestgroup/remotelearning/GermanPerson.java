package com.iquestgroup.remotelearning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GermanPerson extends Person {

    public GermanPerson(String firstName, String surName, String dateOfBirth) {
        super(firstName, surName, dateOfBirth);
    }

    public GermanPerson(String fullName, String dateOfBirth) {
        super(fullName, dateOfBirth);
    }

    @Override
    public String getBirthDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/dd/MM");
        LocalDate germanBirthDate = LocalDate.parse(dateOfBirth, formatter);
        String birthDateGermanFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH).format(germanBirthDate);
        return birthDateGermanFormat;
    }

    @Override
    public void selfDescribe() {
        System.out.println("Hallo, meine Name ist " + getFirstName() + " " + getSurName() + " und ich bin " + calculateAge()
                + " Jahre alt");

    }


}

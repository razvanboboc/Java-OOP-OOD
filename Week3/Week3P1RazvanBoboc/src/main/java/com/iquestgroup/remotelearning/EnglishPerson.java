package com.iquestgroup.remotelearning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EnglishPerson extends Person {

    public EnglishPerson(String firstName, String surName, String dateOfBirth) {
        super(firstName, surName, dateOfBirth);
    }

    public EnglishPerson(String fullName, String dateOfBirth) {
        super(fullName, dateOfBirth);
    }

    @Override
    public String getBirthDate(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/dd/MM");
        LocalDate englishBirthDate = LocalDate.parse(dateOfBirth, formatter);
        String birthDateEnglishFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH).format(englishBirthDate);
        return birthDateEnglishFormat;
    }

    @Override
    public void selfDescribe() {
        System.out.println("Hello, my name is " + getFirstName() + " " + getSurName() + " and I am " + calculateAge()
                + " years old");

    }

}

package com.iquestgroup.remotelearning;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private String firstName;
    private String surName;
    protected final String dateOfBirth;
    public Person(String firstName, String surName, String dateOfBirth) {
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }
    public Person(String fullName, String dateOfBirth) {
        String[] fullNameArray = fullName.split(" ");
        this.firstName = determineFirstName(fullNameArray);
        this.surName = fullNameArray[fullNameArray.length - 1];
        this.dateOfBirth = dateOfBirth;
    }

    private String determineFirstName(String[] fullNameArray) {
        String[] firstNameArray = new String[fullNameArray.length -1];
        for(int i = 0; i < fullNameArray.length - 1; i++) {
            firstNameArray[i] = fullNameArray[i];
        }
        String firstName = String.join(" ", firstNameArray);
        return firstName;
    }

    private LocalDate extractBirthDate(String dateOfBirth) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/dd/MM");
        return LocalDate.parse(dateOfBirth, formatter);
    }

    public int calculateAge() {
        LocalDate presentTime = LocalDate.now();
        LocalDate birthDate = extractBirthDate(dateOfBirth);
        return Period.between(birthDate, presentTime).getYears();
    }

    public abstract void selfDescribe();

    public abstract String getBirthDate();

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

}


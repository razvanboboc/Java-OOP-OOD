package com.iquestgroup.remotelearning;

public class Person {
    private String firstName;
    private String surName;
    private String middleName;
    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }
    public Person(String fullName) {
        String[] fullNameArray = fullName.split(" ");
        this.firstName = determineFirstName(fullNameArray);
        this.middleName = determineMiddleName(fullNameArray);
        this.surName = fullNameArray[fullNameArray.length - 1];
    }

    private String determineMiddleName(String[] fullNameArray) {
        String[] middleNameArray = new String[fullNameArray.length -1];
        for(int i = 0; i < fullNameArray.length - 1; i++) {
            if(!fullNameArray[i].contains("*")){
                middleNameArray[i] = fullNameArray[i];
            }
            middleNameArray[i] = fullNameArray[i];
        }
        String middleName = String.join(" ", middleNameArray);
        return middleName;
    }

    private String determineFirstName(String[] fullNameArray) {
        String firstNameString = new String();
        for(int i = 0; i < fullNameArray.length - 1; i++) {
            if(fullNameArray[i].contains("*")){
                StringBuilder builder = new StringBuilder(fullNameArray[i]);
                builder.deleteCharAt(fullNameArray[i].length() - 1);
                firstNameString = builder.toString();
            }
        }
        return firstNameString;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getSurName() {
        return surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String showNames () {
        return "Firstname: " + firstName + " Surname: " + surName;
    }

}


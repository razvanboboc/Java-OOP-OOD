package com.iquestgroup.remotelearning;

public class App {
    public static void main(String[] args) {
        Person englishPerson = new EnglishPerson("Will", "Smith","1968/25/09");
        Person germanPerson = new GermanPerson("Hans Der Erste Jurgen II","1980/11/05");

        englishPerson.selfDescribe();
        germanPerson.selfDescribe();

        System.out.println("The birthdate of " + englishPerson.getFirstName() +  " " + englishPerson.getSurName() + " in English Format is " + englishPerson.getBirthDate());
        System.out.println("The birthdate of " + germanPerson.getFirstName() +  " " + germanPerson.getSurName() + " in German Format is " + germanPerson.getBirthDate());
    }
}


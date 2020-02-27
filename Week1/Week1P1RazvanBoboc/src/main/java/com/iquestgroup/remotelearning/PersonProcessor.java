package com.iquestgroup.remotelearning;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class PersonProcessor {

    private static final int maxarraylength = 4;
    private Set<Person> listOfPersons = new HashSet<Person>();

    private String[] inputFile() throws IOException {
        String[] stringsFromFile = ReadFromFile.readLinesFromTextFile("W1P1input.txt");
        return stringsFromFile;
    }

    public void processPersons() throws IOException {
        String[] stringsFromFile = inputFile();
        for (String string : stringsFromFile) {
            String[] stringsAfterSplit = string.split(", ");
            if (stringsAfterSplit.length == maxarraylength) {
                Person person = new Person(stringsAfterSplit[0], stringsAfterSplit[1], stringsAfterSplit[2],
                        stringsAfterSplit[3]);
                listOfPersons.add(person);
            } else {
                Person person = new Person(stringsAfterSplit[0], stringsAfterSplit[1], stringsAfterSplit[2]);
                listOfPersons.add(person);
            }
        }
    }
    public void printPersonsInformation() {
        for (Person person : listOfPersons) {
            System.out.println(person.printPerson());
        }
    }

}

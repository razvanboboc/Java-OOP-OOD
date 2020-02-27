package com.iquestgroup.remotelearning;

import java.io.IOException;

public class App {
    public void start() throws IOException {
        PersonProcessor personProcessor = new PersonProcessor();
        personProcessor.processPersons();
        personProcessor.printPersonsInformation();

    }
    public static void main (String[] args) throws IOException {
        App app = new App();
        app.start();
    }
}

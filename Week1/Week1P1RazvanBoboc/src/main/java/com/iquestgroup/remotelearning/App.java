package com.iquestgroup.remotelearning;

import java.io.IOException;

public class App {
    public void start() throws IOException {
        PersonSets personsets = new PersonSets();
        personsets.inputPersons();
        personsets.outputPersons();

    }
    public static void main (String[] args) throws IOException {
        App app = new App();
        app.start();
    }
}

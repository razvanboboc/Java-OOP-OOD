package com.iquestgroup.remotelearning;

public class App {
    public static void main(String[] args) {
        Frog frog = new Frog("Woodfrog");
        Amphibian amphibian = (Amphibian) frog;

        amphibian.eat();
        amphibian.jump();

        frog.eat();
        frog.jump();

        amphibian.getSpeciesType();
        amphibian.setSpeciesType("American Bullfrog");

        amphibian.getSpeciesType();
        frog.getSpeciesType();

    }
}

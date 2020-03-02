package com.iquestgroup.remotelearning;

public class App {
    public static void main(String[] args) {
        Amphibian amphibian = new Amphibian("AmphibianX");
        Amphibian frog = new Frog("Bullfrog");

        amphibian.jump();
        amphibian.eat();

        frog.eat();
        frog.jump();

        frog.swim();
        amphibian.swim();

    }
}

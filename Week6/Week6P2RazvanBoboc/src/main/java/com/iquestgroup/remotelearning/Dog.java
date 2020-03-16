package com.iquestgroup.remotelearning;

@Logged(used = 1)
public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Logged(used = 1)
    public void eat(String firstThing, String secondThing, String thirdThing) {
        System.out.println("The dog eats " + firstThing);
        System.out.println("The dog eats " + secondThing);
        System.out.println("The dog eats " + thirdThing);
    }

    public void sleep() {
        System.out.println("The dog sleeps");

    }

    public String getName() {
        return name;
    }

}


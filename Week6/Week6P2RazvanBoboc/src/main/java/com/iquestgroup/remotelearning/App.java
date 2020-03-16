package com.iquestgroup.remotelearning;

public class App {

    public static void main(String[] args) {

        Animal dog = new Dog("Scrappy");

        ProxyFactory proxyFactory = new ProxyFactory();

        dog = (Animal) proxyFactory.getProxyInstance(dog, new Class[] {Animal.class});

        dog.eat("meat", "bone", "dog food");
        dog.sleep();


    }
}
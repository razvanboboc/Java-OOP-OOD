package com.iquestgroup.remotelearning;


public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Razvan", "Boboc");
        Person person2 = new Person("Valentina Eugenia Antoinette");
        Person person3 = new Person("Eric Ferdinand John Marius Cristian Popescu");

        System.out.println(person1.showNames());
        System.out.println(person2.showNames());
        System.out.println(person3.showNames());

    }
}

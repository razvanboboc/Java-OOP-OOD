package com.iquestgroup.remotelearning;

public class Car {
    public static Door leftFrontDoor;
    public Door rightFrontDoor;
    public Door leftBackDoor = new Door(3);
    public Door rightBackDoor;
    {
        System.out.println("This is an init block");
        rightFrontDoor = new Door(2);
        System.out.println("This is the end of init block");
    }
    static {
        System.out.println("This is the static block");
        leftFrontDoor = new Door(1);
        System.out.println("This is the end of static block");
    }

    public Car() {
        System.out.println("This is the constructor of the Car class");
        rightBackDoor = new Door(4);
    }
}


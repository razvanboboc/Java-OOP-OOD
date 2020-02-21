package com.iquestgroup.remotelearning;

public class App {
    public static void main(String[] args) {
        ConstructorParent constructorParent = new ConstructorParent();
        ConstructorChild constructorChild = new ConstructorChild();
        ConstructorChild constructorChildWithParameters = new ConstructorChild(
                " : This is the constructor with parameters from ConstructorChild");
        constructorChildWithParameters.printValue(10);

        Car.leftFrontDoor.openDoor();
        Car car = new Car();
    }
}

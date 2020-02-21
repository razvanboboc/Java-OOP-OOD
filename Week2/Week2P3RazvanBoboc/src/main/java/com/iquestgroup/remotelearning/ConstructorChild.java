package com.iquestgroup.remotelearning;

public class ConstructorChild extends ConstructorParent {
    int number = initializeNumber(10);
    public ConstructorChild() {
        System.out.println("This is the constructor with no parameters from the ConstructorChild");
    }
    public ConstructorChild(String message) {
        super("This message comes from the constructor with parameters from ConstructorParent");
        System.out.println("This message comes from the constructor with parameters from ConstructorChild " + message);
    }

    private int initializeNumber(int numberValue) {
        System.out.println("Number is being assigned a value");
        return numberValue;
    }


    public void printValue(int i) {
        System.out.println("The value of the number is: " +  number);
    }
}

package com.iquestgroup.remotelearning;

public class InvalidInterfaceException extends RuntimeException {

    public InvalidInterfaceException() {
        super("The class does not implement any given interfaces");
    }
}

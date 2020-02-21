package com.iquestgroup.remotelearning;

public class App
{

    public static void main(String[] args) {

        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.start(Integer.parseInt(args[0]));
    }
}
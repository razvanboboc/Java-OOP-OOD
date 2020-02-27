package com.iquestgroup.remotelearning;

public class App
{

    public static void main(String[] args) {

        PrimeNumberCalculator primeNumberCalculator = new PrimeNumberCalculator();
        primeNumberCalculator.calculatePrimeNumbers(Integer.parseInt(args[0]));
    }
}
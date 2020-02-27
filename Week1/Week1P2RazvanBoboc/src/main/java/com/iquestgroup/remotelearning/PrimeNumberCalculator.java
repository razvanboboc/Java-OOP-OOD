package com.iquestgroup.remotelearning;

public class PrimeNumberCalculator {

    public void start(int upperBound) {

        boolean primes[] = new boolean[upperBound + 1];

        for (int i = 2; i <= upperBound; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= upperBound; i++) {

            if (primes[i] == true) {

                for (int j = 2 ; j <= upperBound; j++) {
                    if(j * i < primes.length)
                        primes[j * i] = false;
                }

            }
        }
        for (int i = 1; i <= upperBound; i++) {
            if (primes[i] == true)
                System.out.print(i + "-PRIME, ");
            else
                System.out.print(i + ", ");
        }
    }

}

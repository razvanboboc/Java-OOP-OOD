package com.iquestgroup.remotelearning;


public class App {

    public static void main(String[] args) {
        Tank tank = new Tank();
        int numbersToBePushedIntoTank = 15;

        tank.pushElementsIntoTank(numbersToBePushedIntoTank);

        tank.popElementsFromTank();

        tank.pushElementsIntoTank(1);

        tank = null;

        Runtime.getRuntime().gc();

    }
}


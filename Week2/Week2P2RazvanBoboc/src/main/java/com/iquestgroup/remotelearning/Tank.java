package com.iquestgroup.remotelearning;

import java.util.Stack;

public class Tank {
    private Stack<Object> stack;
    private int stackSize;

    public Tank() {
        stackSize = 10;
        stack = new Stack<Object>();
    }

    public boolean isNotEmpty() {
        if (stack.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void popElementsFromTank() {
        while (isNotEmpty()) {
            Object poppedElement = stack.pop();
            System.out.println("The element " + poppedElement + " was popped");
        }
    }

    public void pushElementsIntoTank(int numbersToBePushedIntoTank) {
        for (int number = 0; number < numbersToBePushedIntoTank; number++) {
            if (stack.size() == stackSize) {
                System.out.println("The tank is full, cannot add more elements");
            } else {
                stack.push(number);
            }
        }
    }

    @Override
    public void finalize() {
        if (isNotEmpty()) {
            System.out.println(
                    "The tank is not empty, we must dispose of the elements before calling the garbage collector");
            stack.removeAllElements();
            System.out.println("The garbage collector is being called");
        } else {
            System.out.println("The tank is empty, the garbage collector is being called");
        }
    }
}


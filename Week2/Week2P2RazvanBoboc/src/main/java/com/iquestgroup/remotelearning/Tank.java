package com.iquestgroup.remotelearning;

import java.util.Stack;

public class Tank {
    private Stack<Object> stack;
    private int stackSize;

    public Tank() {
        stackSize = 10;
        stack = new Stack<Object>();
    }

    public void popElementsFromTank() {
        while (stack.size() != 0) {
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
        if (stack.size() != 0) {
            System.out.println(
                    "The tank is not empty, the elements will be removed, so that the garbage collector can begin its execution");
            stack.removeAllElements();
            System.out.println("The garbage collector can begin its execution");
        } else {
            System.out.println("The tank is empty, the garbage collector can begin its execution");
        }
    }
}


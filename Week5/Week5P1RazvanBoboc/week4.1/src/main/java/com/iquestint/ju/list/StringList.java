package com.iquestint.ju.list;

import com.iquestint.ju.exceptions.InvalidNumberFormatException;
import com.iquestint.ju.exceptions.NullOrEmptyException;
import com.iquestint.ju.exceptions.OutOfBoundsException;

import java.util.ArrayList;
import java.util.Arrays;

public class StringList implements List<String> {
    private int[] integerArray;
    private int stringListSize;
    private int indexer;
    private int currentListSize;
    private ArrayList<String> operationsHistory;


    public StringList(int StringListSize) {
        this.stringListSize = stringListSize;
        integerArray = new int[StringListSize];
        operationsHistory = new ArrayList<String>();
        indexer = 0;
        currentListSize = 0;
    }

    @Override
    public void add(String element) {
        if (currentListSize == integerArray.length) {
            System.out.println("The String list is full, the capacity will be extended.");
            int extendedCapacity = currentListSize + 10;
            integerArray =  Arrays.copyOf(integerArray, extendedCapacity);
            operationsHistory.add("The capacity was extended by 10");
            integerArray[indexer] = Integer.parseInt(element);
            operationsHistory.add("The element " + element + " was added in position " + indexer);
            indexer++;
            currentListSize++;
        } else if (element == null) {
            throw new NullOrEmptyException("The element is null");
        } else {
            try {
                integerArray[indexer] = Integer.parseInt(element);
                operationsHistory.add("The element" + element + " was added in position" + indexer);
                indexer++;
                currentListSize++;
            } catch (NumberFormatException e) {
                throw new InvalidNumberFormatException();
            }
        }

    }

    @Override
    public String get(int position) {
        if (position >= currentListSize) {
            throw new OutOfBoundsException("Index out of bounds.");
        }
        return String.valueOf(integerArray[position]);
    }

    @Override
    public boolean contains(String element) {
        for (int index = 0; index < integerArray.length; index++) {
            if (integerArray[index] == Integer.parseInt(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(List<String> customList) {
        boolean containsAll = true;
        for (int index = 0; index < customList.size(); index++) {
            String elementFromCustomList = customList.get(index);
            if (!contains(elementFromCustomList)) {
                containsAll = false;
            }
        }
        return containsAll;
    }

    @Override
    public int size() {
        return currentListSize;
    }

    public void showOperationsHistory() {
        for (String string : operationsHistory) {
            System.out.println(string);
        }
    }

    public ArrayList<String> getOperationsHistory() {
        return operationsHistory;
    }

    public int getSizeOfList() {
        return stringListSize;
    }
}

